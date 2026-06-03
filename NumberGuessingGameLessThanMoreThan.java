public class NumberGuessingGameLessThanMoreThan {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.Random random = new java.util.Random();

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int guess = 0;

        System.out.println("--- Welcome to the Number Guessing Game! ---");
        System.out.println("I have selected a number between 1 and 100.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfAttempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
            }
        }

        scanner.close();
    }

}
