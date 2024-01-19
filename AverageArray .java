class AverageArray {
    public static void main(String[] args) {
        double[] doubleArray = {1.5, 2.0, 3.5, 4.0, 5.5};
        double average = calculateAverage(doubleArray);
        System.out.println("Double Array: " + arrayToString(doubleArray));
        System.out.println("Average: " + average);
    }
    static double calculateAverage(double[] array) {
        if (array.length == 0) {
            return 0.0; 
        }
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
    static String arrayToString(double[] array) {
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
