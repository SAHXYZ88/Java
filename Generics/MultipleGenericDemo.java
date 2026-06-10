class Pair<T,U>{
    T first;
    U second;
}

public class MultipleGenericDemo {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>();
        student.first="SAH";
        student.second=213;
        System.out.println(student.first);
        System.out.println(student.second);

    }
    
}
