import java.util.Scanner;

class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class CustomUncheckedException{

    public static void checkNumber(int number) {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed. You entered: " + number);
        } else {
            System.out.println("The entered number is: " + number);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            checkNumber(number);

        } catch (NegativeNumberException e) {
            // Handle the custom unchecked exception
            System.out.println("NegativeNumberException caught: " + e.getMessage());
        }
    }
}

