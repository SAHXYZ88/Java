public class ThrowDemo {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("Can't Divide By Zero");
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    
}
