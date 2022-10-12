package lab.lap10OOP.School;

public class App {
    public static void main(String[] args) {
        System.out.println("============Person===========");
        Person person = new Person("Thoai", 20, "65A");
        person.display();
        System.out.println("============Student===========");
        Student student = new Student("Thanh", 19, "63A", 9.0);
        student.display();
        System.out.println("============Teacher===========");
        Teacher teacher = new Teacher("Duong", 40, "Thanh pho", 200);
        teacher.display();
    }
}
