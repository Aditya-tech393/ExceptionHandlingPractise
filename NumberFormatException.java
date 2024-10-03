import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input: ");
        String name=sc.next();

        try {
            int conversion = Integer.parseInt(name);
            System.out.println("String converted to integer: "+conversion);
        }
        catch (java.lang.NumberFormatException e) {
            System.out.println("String "+name+" cannot be converted to integer");
        }
    }
}
