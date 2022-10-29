package InnerAndAbstractClassesAndInterfaces.Animal;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        super.fly();
        System.out.println("I'm not very good at that, can I go for a swim instead");
    }

    // @Override
    // public void fly() {
    // // TODO Auto-generated method stub
    // System.out.println("I'm not very good at that, can I go for a swim instead");
    // }

}
