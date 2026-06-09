public class MultipleCatchDemo {
    public static void main(String[] args) {
        try{
            int arr[] = {10,20,30};
            System.out.println(arr[5]);
            int result = 10 / 0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
