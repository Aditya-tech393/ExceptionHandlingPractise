public class MyArithmeticException extends Throwable {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        try {
            int c = a / b;
            System.out.println("Output: " + c);
        }
        catch (Exception e){
            System.out.println("Cannot divide by O. Try dividing by another number.");
        }
        System.out.println("Main method ended");
    }
}
