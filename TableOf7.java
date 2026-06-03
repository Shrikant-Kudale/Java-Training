public class TableOf7 {
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Multiplication Table of " + number);
        System.out.println("---------------------------");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            // Using string concatenation to format the output
            String output = number + " x " + i + " = " + result;
            System.out.println(output);
        }
    }

}
