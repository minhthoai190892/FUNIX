package InnerAndAbstractClassesAndInterfaces.GearBox;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        // // tạo đối tượng cha
        // Gearbox gearbox = new Gearbox(6);
        // // // tạo đối tượng con
        // // Gearbox.Gear first = gearbox.new Gear(1, 12.3);
        // // // gọi hàm của đối tượng con
        // // System.out.println(first.driveSpeed(10000));
        // // gearbox.addGear(1, 5.3);
        // // gearbox.addGear(2, 10.6);
        // // gearbox.addGear(3, 15.9);
        // gearbox.operateClutch(true);
        // gearbox.changeGear(1);
        // gearbox.operateClutch(false);
        // System.out.println(gearbox.wheelSpeed(1000));
        // System.out.println("======");
        // gearbox.changeGear(2);
        // System.out.println(gearbox.wheelSpeed(3000));
        // gearbox.operateClutch(true);
        // gearbox.changeGear(3);
        // gearbox.operateClutch(false);
        // System.out.println(gearbox.wheelSpeed(6000));
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");

            }

        }
        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;

                default:
                    break;
            }
        }
    }
}
