class Studentz{
    private String name;
    private int age;
    private int rollno;
    Studentz(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getRollno(){
        return rollno;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
    }
    void display(){
        System.out.println("Name Of The Student Is " + name + " Age Is " + age + " And Roll No Is  " + rollno);
    }
}

public class Main {
    public static void main(String[] args) {
        Studentz s1 = new Studentz("Sahalam",21,213);
        Studentz s2 = new Studentz("Zaid",22,133);

        s1.display();
        s1.setAge(22);
        s2.display();

        System.out.println("Updated Age Of Student 1 Is : " + s1.getAge());
    }

}
