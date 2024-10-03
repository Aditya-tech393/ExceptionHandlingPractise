public class MultipleCatchBlock {
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        try{
            //Case 1
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);

            //Case 2
            int[] arr={0,1,2,3,4};
            System.out.println(arr[6]);

            //Case 3
            String name=null;
            System.out.println(name.toUpperCase());
        }
        catch (java.lang.ArithmeticException a){
            System.out.println("Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException b){
            System.out.println("Out of bound.");
        }
        catch (java.lang.NullPointerException c){
            System.out.println("Cannot cast NULL.");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main method ended.");
    }
}
