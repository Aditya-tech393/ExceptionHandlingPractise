public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(java.lang.ArithmeticException e){
            System.out.println("You cannot divide by 0.");

        }
        finally {
            System.out.println("This is finally block.");
        }
        System.out.println("Main Method Ended.");
    }
}
