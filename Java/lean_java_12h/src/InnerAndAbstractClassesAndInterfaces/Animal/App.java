package InnerAndAbstractClassesAndInterfaces.Animal;

public class App {
    public static void main(String[] args) {
        // Dog dog = new Dog("Dog1");
        // dog.breathe();
        // dog.eat();
        Parrot parrot = new Parrot("Australian ringheck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
