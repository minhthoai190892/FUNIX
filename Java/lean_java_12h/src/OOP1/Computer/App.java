package OOP1.Computer;

public class App {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resoltion(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PC thePc = new PC(theCase, theMonitor, theMotherboard);
        // ! muốn đi vào phương thức bên trong lớp con
        // ta đi từ lớp cha vào lớp con và gọi phương thức
       thePc.powerUp();
    }
}
