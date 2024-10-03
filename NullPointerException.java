import java.util.Scanner;

public class NullPointerException {
    public static void main(String[] args) {
        System.out.println("Main method started");

        Scanner sc=new Scanner(System.in);
        String userInput=null;

        System.out.println("Do you want to enter a string? (YES/NO)");
        String choice=sc.next();

        if (choice.equalsIgnoreCase("yes")){
            System.out.print("Enter a String: ");
            userInput=sc.next();
        }

        try{
            System.out.println("Casted to lowercase: "+userInput.toLowerCase());
        }
        catch(java.lang.NullPointerException e){
                System.out.println("Null cannot be casted");
        }


//        System.out.print("Enter your name: ");
//        String name=sc.next();
//        try{
//            System.out.println(name.toUpperCase());
//        }
//        catch (java.lang.NullPointerException e){
//            System.out.println("Cannot cast null");
//        }
        System.out.println("Main Method ended");
    }
}
