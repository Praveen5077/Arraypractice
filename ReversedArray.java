import java.util.Arrays;

 class ReverseArray {
    public static void main(String[] args) {
        // Example array
        int[] originalArray = {5, 4, 3, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        int[] reversedArray = reverseArray(originalArray);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
    static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }
        return reversedArray;
    }
}
