public class exception {
    public static void main(String[] args) {
        try{
            int a= 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("exception" + e.getMessage());
        }
        finally {
            System.out.println("finally block always executes");
        }
    }
}
