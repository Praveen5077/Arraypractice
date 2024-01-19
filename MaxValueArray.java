public class MaxValueArray {
    public static void main(String[] args) {
        int[] intArray = {5, 8, 2, 10, 7, 1};
        int maxValue = findMaxValue(intArray);
        System.out.println("Integer Array: " + arrayToString(intArray));
        System.out.println("Maximum Value: " + maxValue);
    }
    static int findMaxValue(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
