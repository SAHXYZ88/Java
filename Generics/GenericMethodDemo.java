public class GenericMethodDemo {
    static <T> void printValue(T value){
        System.out.println(value);
    }
    public static void main(String[] args) {
        printValue("SAH");
        printValue(100);
        printValue(true);
    }
}
