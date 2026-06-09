public class FinallyDemo {
    public static void main(String[] args) {
        try{
            int result = 10 / 2;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally Block Executed");
        }
    } 
}
