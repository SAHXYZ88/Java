class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            super(message);
        }
    }

public class CustomExceptionDemo {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
                throw new InvalidAgeException("Age Must Be 18+");
            }
        }

        public static void main(String[] args) {
        try{
            checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println(e);
        }
        
    }
}
