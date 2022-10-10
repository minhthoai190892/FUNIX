package OOP1.Car;

public class Car extends Vehicel{
    // ! tạo các field cho lớp
   private int doors;
   private int engineCapacity;
public Car(String name, int doors, int engineCapacity) {
    super(name);
    this.doors = doors;
    this.engineCapacity = engineCapacity;
}
   
}
