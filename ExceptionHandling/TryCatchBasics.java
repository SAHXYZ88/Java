public class TryCatchBasics{
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            // System.out.println("Cant Divide y Zero");
            System.out.println(e);
        }
    }

}
