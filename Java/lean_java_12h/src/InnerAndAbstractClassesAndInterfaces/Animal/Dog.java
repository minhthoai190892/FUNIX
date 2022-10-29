package InnerAndAbstractClassesAndInterfaces.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println(getName()+" is eating");
    }

    @Override
    public void breathe() {
        // TODO Auto-generated method stub
        System.out.println("Breathe in, breathe out, repeat");
    }
    
}
