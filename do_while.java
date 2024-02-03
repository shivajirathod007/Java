import java.util.Scanner;

public class do_while {

    public static void main(String[] args) {
        /*
         * // Generate a random number between 1 and 10
         * int secretNumber = (int) (Math.random() * 10) + 1;
         * 
         * // Initialize the user's guess
         * int userGuess;
         * 
         * // Create a Scanner object to take input from the user
         * Scanner scanner = new Scanner(System.in);
         * 
         * // Start a do-while loop
         * do {
         * // Ask the user to guess the number
         * System.out.print("Guess the number (between 1 and 10): ");
         * userGuess = scanner.nextInt();
         * 
         * // Check if the guess is correct
         * if (userGuess == secretNumber) {
         * System.out.println("Congratulations! You guessed the correct number.");
         * } else {
         * System.out.println("Incorrect guess. Try again!");
         * }
         * 
         * } while (userGuess != secretNumber);
         * 
         * // Close the Scanner
         * scanner.close();
         */
        byte b = 50;
        b = (byte) (b * 2);
        System.out.println(b);
    }
}
