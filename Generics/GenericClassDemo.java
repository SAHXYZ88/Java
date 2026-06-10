class Box<T> {
    T value;

}

public class GenericClassDemo {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        box1.value = "SAH";
        System.out.println(box1.value);
        box2.value = 100;
        System.out.println(box2.value);
    }
}
