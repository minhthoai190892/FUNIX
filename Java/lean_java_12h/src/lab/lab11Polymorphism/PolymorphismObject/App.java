package lab.lab11Polymorphism.PolymorphismObject;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[3] = new Duck();
		for (int i = 0; i < 4; i++) {
			animals[i].sound();
		}
    }
}
