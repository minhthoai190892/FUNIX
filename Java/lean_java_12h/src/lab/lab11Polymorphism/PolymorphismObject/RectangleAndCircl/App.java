package lab.lab11Polymorphism.PolymorphismObject.RectangleAndCircl;

public class App {
    public static void main(String[] args) {
        IShap[] iShaps = new IShap[3];
        iShaps[0] = new Rectangle(3.4, 5.3);
        iShaps[1] = new Circl(5.5);
        iShaps[2] = new Rectangle(7.4, 4.3);
        for (int i = 0; i < iShaps.length; i++) {
            System.out.println("Area of shapes[" + i + "]: " + iShaps[i].getArea());
            System.out.println("Perimeter of shapes[" + i + "]: " + iShaps[i].getPerimeter());

        }
        System.out.println("====");
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
