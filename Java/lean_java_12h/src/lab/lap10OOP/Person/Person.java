package lab.lap10OOP.Person;

public class Person {
    private String name;
    private int dob;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDob() {
        return dob;
    }
    public void setDob(int dob) {
        this.dob = dob;
    }
    public Person(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }
    
    
}
