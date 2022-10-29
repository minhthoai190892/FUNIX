package lab.lap10OOP.UpcastingandDowncasting;

public class App {
    public static void main(String[] args) {
        // Upcastin
        Animal animal = new Dog();
        animal.sound();
        // Downcasting
        ((Dog) animal).play();
        
    }
}
