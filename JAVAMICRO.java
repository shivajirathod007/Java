import java.io.*;
import java.util.*;

interface AdminAccess {
    boolean adminLogin();
}

class Data {
    public String name;
    int uid;
    String password = null;
    long PNumber = 0;
    String city;

    protected void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            System.out.println("Error while clearing console: " + e.getMessage());
        }
    }
}

class Registration extends Data {
    Scanner sc = new Scanner(System.in);

    void register() throws InterruptedException {
        super.clearConsole();
        System.out.println("**************** Registration *****************************");
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("UID is generating by the System. Please wait.");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.print(".");
        }
        System.out.println();
        uid = (int) (Math.random() * 999999) + 1;
        System.out.println("Your UID is: " + uid);
        Console console = System.console();
        if (console == null) {
            System.out.println("Console is not available");
            System.exit(1);
        }

        while (true) {
            password = new String(console.readPassword("Enter the password: "));
            String vPass = new String(console.readPassword("Enter the password again to verify: "));

            if (password.equals(vPass)) {
                System.out.println("Password matched. Registration successful!");
                break;
            } else {
                System.out.println("Passwords do not match. Please try again.");
            }
        }

        System.out.print("Enter the phone number: ");
        PNumber = sc.nextLong();
        String phoneNumber = Long.toString(PNumber);
        if (phoneNumber.length() < 10) {
            System.out.println("Enter a valid phone number...");
            while (phoneNumber.length() < 10) {
                System.out.print("Enter phone number again: ");
                PNumber = sc.nextLong();
                phoneNumber = Long.toString(PNumber);
            }
        }

        sc.nextLine();
        System.out.print("Enter the city: ");
        city = sc.nextLine();
    }

    boolean login() {
        clearConsole();
        long uidOrNumber;
        String pass;
        System.out.println("Enter the UID or Phone Number: ");
        uidOrNumber = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the password: ");
        pass = sc.nextLine().trim();
        if ((uidOrNumber == uid || uidOrNumber == PNumber) && pass.equalsIgnoreCase(password)) {
            System.out.println("Login successful for user: " + name);
            super.clearConsole();
            return true;
        } else {
            System.out.println("Login failed. Please try again.");
            return false;
        }
    }
}

class Question extends Registration {
    String prompt;
    String[] options;
    int answer;

    public Question(String prompt, String[] options, int answer) {
        this.prompt = prompt;
        this.options = options;
        this.answer = answer;
    }

    public void displayQuestion() {
        System.out.println(prompt);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean checkAnswer(int userAnswer) {
        return userAnswer == answer;
    }
}

class Quiz extends Data implements AdminAccess {
    List<Question> questions;
    int score;

    public static void clearBuffer1(Scanner scanner) {
        scanner.nextLine(); // Read and discard any remaining input
    }

    public void addQuestion() {
        clearConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of questions you want to add:");
        // int numQuestions = scanner.nextInt();
        int numQuestions = Integer.parseInt(scanner.nextLine());
        // scanner.nextLine(); // Consume newline character
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("quiz.txt", true));
            for (int i = 0; i < numQuestions; i++) {
                System.out.println("Enter the question:");
                String prompt = scanner.nextLine();
                writer.write(prompt);
                writer.newLine();

                System.out.println("Enter the options:");
                for (int j = 0; j < 4; j++) {
                    String option = scanner.nextLine();
                    writer.write(option);
                    writer.newLine();
                }

                System.out.println("Enter the correct option number (1-4):");
                // int answer = scanner.nextInt() - 1;
                int answer = Integer.parseInt((scanner.nextLine())) - 1;
                // scanner.nextLine(); // Consume newline character
                writer.write(String.valueOf(answer));
                writer.newLine();
            }
            writer.close();
            System.out.println("Questions added successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error in this file: " + e.getMessage());
        }
        // scanner.nextLine();
        // scanner.close();
    }

    @SuppressWarnings("resource")
    public void removeQuestion() {
        Scanner scanner = new Scanner(System.in);
        if (questions.isEmpty()) {
            System.out.println("No questions to remove.");
            return;
        }
        System.out.println("Current questions:");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i).prompt);
        }
        System.out.print("Enter the index of the question to remove: ");
        // int index = scanner.nextInt();
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 1 && index <= questions.size()) {
            questions.remove(index - 1);
            System.out.println("Question removed successfully.");
        } else {
            System.out.println("Invalid index.");
        }
        // scanner.nextLine(); // Consume newline character
        // scanner.close();
    }

    // Method implementation for adminLogin()
    @SuppressWarnings("resource")
    public boolean adminLogin() {
        clearConsole();
        Scanner scanner1 = new Scanner(System.in);
        try {
            System.out.println("Enter Name");
            String adname = scanner1.nextLine();

            // Define the correct password
            String correctPassword = "2345";

            // Loop until the correct password is entered or user chooses to exit
            while (true) {
                System.out.println("Enter admin's password:");
                String inputPassword = scanner1.nextLine(); // Read the password input from the user

                // Check if the input password matches the correct password
                if (inputPassword.equals(correctPassword)) {
                    System.out.println("Password matched");
                    System.out.println("**Welcome," + adname + "!");
                    int ch1;
                    // Exit the loop if the password is correct
                    do {

                        System.out.println("1. add question in the file \n 2. remove question \n 3. exit");
                        System.out.println("enter your choice: ");
                        ch1 = Integer.parseInt(scanner1.nextLine());

                        switch (ch1) {
                            case 1:
                                addQuestion();

                                break;
                            case 2:
                                removeQuestion();

                                break;
                            case 3:
                                System.out.print("hit enter to exit....");

                                break;
                            default:

                                System.out.println("invalid option");
                                break;
                        }

                    } while (ch1 != 3);
                    clearBuffer1(scanner1);
                    // scanner1.close();
                    return true;
                } else {
                    System.out.println("Incorrect password. Access denied!");
                    System.out.println("Choose an option:");
                    System.out.println("1. Re-enter the password");
                    System.out.println("2. Go back to options");
                    // int option = scanner1.nextInt();
                    int option = Integer.parseInt(scanner1.nextLine());
                    if (option == 2) {
                        return false; // User chooses to go back to options
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {

            // scanner1.close(); // Close the scanner1
        }

        return false;
    }

    // Constructor for Quiz class
    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    // Method for running the quiz
    // Method to clear the input stream
    void clearBuffer(Scanner scanner1) {
        scanner1.nextLine(); // Read and discard any remaining input
    }

    // Method to run the quiz
    public void runQuiz() {
        clearConsole();
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            question.displayQuestion();
            int userAnswer;
            try {
                userAnswer = scanner.nextInt();
                clearBuffer(scanner); // Clear the input stream
                if (userAnswer < 1 || userAnswer > 4) {
                    throw new IllegalArgumentException("Invalid input! Please enter a number between 1 and 4.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                clearBuffer(scanner); // Clear the input stream
                continue; // Skip to the next iteration of the loop
            }

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }
        System.out.println("Quiz completed! Your score is: " + score);
    }

}

public class JAVAMICRO extends Data {
    // Define a Scanner object as a class variable
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Data d1 = new Data();
        d1.clearConsole();
        int ch = 0;
        Registration r1 = new Registration();
        List<Question> questions = readQuestionsFromFile();
        Quiz q1 = new Quiz(questions);

        try {
            do {
                // Display menu options
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Welcome to the Quiz!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("1. User Register");
                System.out.println("2. User Login");
                System.out.println("3. Admin Login");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                // ch = scanner.nextInt();
                ch = Integer.parseInt(scanner.nextLine());

                // Process user choice
                switch (ch) {
                    case 1:
                        r1.register();
                        break;
                    case 2:
                        if (r1.login()) {
                            if (r1.uid != 0) {
                                q1.runQuiz();
                            } else {
                                System.out.println("Login failed. Please register or try again.");
                            }
                        }
                        break;
                    case 3:
                        q1.adminLogin();
                        break;
                    case 4:
                        return; // Exit the method (and program) if user chooses to exit
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                        break;
                }
            } while (ch != 4);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
            // scanner.nextLine(); // Consume invalid input
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // scanner.nextLine();
        }

        // Close the scanner after the main method ends
        // scanner.close();
    }
    // Other methods remain unchanged

    public static List<Question> readQuestionsFromFile() {
        List<Question> questions = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("quiz.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String prompt = line;
                String[] options = new String[4];
                for (int i = 0; i < 4; i++) {
                    options[i] = reader.readLine();
                }
                int answer = 0; // Default value
                String answerLine = reader.readLine();
                if (!answerLine.isEmpty()) {
                    answer = Integer.parseInt(answerLine);
                }
                questions.add(new Question(prompt, options, answer));
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error in this file: " + e.getMessage());
        }
        return questions;
    }

}