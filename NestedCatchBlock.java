public class NestedCatchBlock {
    public static void main(String[] args) {
        System.out.println("Main Method Started.");
        try{
            System.out.println(10/2);
        }
        catch (Exception e){
            System.out.println(e);
            try{
                String name=null;
                System.out.println(name.toUpperCase());
            }
            catch (java.lang.NullPointerException a){
                System.out.println("Cannot cast null values.");
            }
        }
        System.out.println("Main method ended.");
    }
}
