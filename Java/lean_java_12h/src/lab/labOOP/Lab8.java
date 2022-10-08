package lab.labOOP;

public class Lab8 {
    public static void main(String[] args) {
        System.out.println("8.1. Khái báo lớp và đối tượng trong Java");
        // Student student = new Student();
        // student.getInformation();
        // student.display();

        System.out.println("8.2. Bài tập Java OOP: tính chu vi và diện tích của hình chữ nhật");
        // Rectangle rectangle = new Rectangle();
        // rectangle.getInformation();
        // rectangle.display();

        // 8.4. Phương thức khởi tạo có tham số trong Java
        Student s1 = new Student("Long", 24);
        Student s2 = new Student("Kien", 29);
        s1.display();
        s2.display();
    }

}
