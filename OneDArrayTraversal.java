public class OneDArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Traversing 1D array using nested loops:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        }
    }

}