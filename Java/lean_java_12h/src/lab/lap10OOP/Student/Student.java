package lab.lap10OOP.Student;

public class Student {
    private String name;
    private char gender;

    public Student() {
        this.name = "Unknown";
        this.gender = 'u';
    }

    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Student(String name) {
        this.name = name;
        gender = 'u';
    }

    public Student(char gender) {
        this.gender = gender;
        name = "Unknown";
    }

    public void display() {
        System.out.println("Name is " + name);
        if (gender == 'u') {
            System.out.println("Gender: Unknown");
        } else if (gender == 'f') {
            System.out.println("Gender: Female");

        } else if (gender == 'm') {
            System.out.println("Gender: Male");

        }
    }
}
