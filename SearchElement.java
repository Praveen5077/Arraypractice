 class SearchElement {
    public static void main(String[] args) {
        int[] intArray = {5, 8, 2, 10, 7, 1};
        int targetElement = 7;
        int index = findElementIndex(intArray, targetElement);
        System.out.println("Integer Array: " + arrayToString(intArray));
        System.out.println("Searching for: " + targetElement); 
        if (index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    static int findElementIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
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
