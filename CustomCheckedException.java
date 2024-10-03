import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomCheckedException{

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {

            throw new InvalidAgeException("Age is less than 18. You must be at least 18 years old.");
        } else {
            System.out.println("You are eligible since your age is " + age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            checkAge(age);

        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("InvalidAgeException caught: " + e.getMessage());
        }
    }
}

