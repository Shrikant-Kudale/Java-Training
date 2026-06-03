public class RunningSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] runningSum = new int[numbers.length];
        int currentSum = 0;

        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            currentSum += numbers[i];
            runningSum[i] = currentSum;
        }

        System.out.println("\nRunning Sum of Array:");
        for (int i = 0; i < runningSum.length; i++) {
            System.out.print(runningSum[i] + " ");
        }
    }

}
