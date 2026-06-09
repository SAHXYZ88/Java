public class ThrowsDemo {
    static void checkAge() throws ArithmeticException {
        throw new ArithmeticException("Age Must 18+");
    }

    public static void main(String[] args) {
        try{
            checkAge();
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
