public class NestedTryBlock {
    public static void main(String[] args) {
        System.out.println("Main Method Started.");
       try{
           try{
               int [] arr={0,1,2,3,4,5};
               System.out.println(arr[0]);
           }
           catch(ArrayIndexOutOfBoundsException a){
               System.out.println("Index entered is out of bound.");
           }
           System.out.println(10/0);
       }
       catch(java.lang.ArithmeticException b){
           System.out.println("Cannot be divided by zero.");
       }
        System.out.println("Main Method Ended.");
    }
}
