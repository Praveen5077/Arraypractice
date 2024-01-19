public class SumArray {
    public static void main(String[] args) {
        int[] intArray = {5, 8, 2, 10, 7, 1};
        int sum = calculateSum(intArray);
        System.out.println("Integer Array: " + arrayToString(intArray));
        System.out.println("Sum of Elements: " + sum);
    }
    static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
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
