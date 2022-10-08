package baihoc.Inheritance;

/**
 * extends: kế thừa lớp cha
 * Animal (class)
 */
public class Dog extends Animal {
    // ! thêm các trường ở lớp con

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    /**
     * 
     * @param name
     * @param brain
     * @param body
     * @param size
     * @param weight
     * 
     *               ! super dùng để gọi hàm tạo dành cho lớp mà chúng ta đang kế
     *               thừa từ lớp cha
     */
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
            String coat) {

        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog eat chew");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(50);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called " + speed);
    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }

}
