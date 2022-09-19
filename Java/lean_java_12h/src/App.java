import javax.swing.JOptionPane;

// import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*
         * int x;// declaration
         * x = 10;// assignment
         * int y = 12;// initialization
         * long longz = 122222222222222L;
         * float xFloat = 3.14f;
         * boolean xBoolean = true;
         * byte xByte = 123;
         * // short xShort = -1231131;
         * char xChar = '$';
         * String name = "asdasd";
         * System.out.println(y);
         * System.out.println("======================");
         * // bien temp
         * String x1 = "water";
         * String y1 = "Kool-Aid";
         * String temp = null;
         * temp = x1;// water
         * x1 = y1;// Kool-Aid
         * y1 = temp;// water
         * System.out.println("x: " + x1);
         * System.out.println("y: " + y1);
         * System.out.println("temp: " + temp);
         */

        // System.out.println("============= Scanner ==================");

        // try (/**
        // * Scanner: người dùng nhập dữ liệu
        // */
        // //tạo đối tượng "Scanner" với từ khóa "new"
        // Scanner scanner = new Scanner(System.in)) {
        // System.out.println("What is your name?: ");
        // // khai báo biến để nhận giá trị (string) người dùng nhập
        // String name = scanner.nextLine();
        // // khai báo biến nhận giá trị "number"
        // System.out.println("How old are you: ");
        // int age = scanner.nextInt();
        // // xoa ky tu "/n"
        // scanner.nextLine();
        // System.out.println("what is your favorite food?: ");
        // // String food = scanner.nextLine();
        // String food = scanner.nextLine();
        // System.out.println("Hello: " + name + " you are " + age + " years old" + "you
        // like food: " + food);
        // // System.out.println("Age: " + age);
        // }
        /*
         * System.out.
         * println("================== Experssion & operands & operators =========================="
         * );
         * double friends = 10;
         * friends = (double)friends /3;
         * 
         * System.out.println(friends);
         */

        // System.out.println("================== GUI intro
        // ==========================");
        // // khai báo biến nhận nhận thông tin người dùng nhập
        // String name = JOptionPane.showInputDialog("Enter your name");
        // // hiển thị thông tin mà người dùng nhập
        // JOptionPane.showMessageDialog(null, "Hello " + name);
        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // JOptionPane.showMessageDialog(null, "Your age " + age + " years old");
        // double hight = Double.parseDouble(JOptionPane.showInputDialog("Enter your
        // hight"));
        // JOptionPane.showMessageDialog(null, "You are " + hight + " cm tall");

        // /**
        // *
        // */
        // // JOptionPane.showMessageDialog(null, "sadfasdf", "qweqwe",
        // // JOptionPane.ERROR_MESSAGE);
        System.out.println("================== Math Class ==========================");

        double x = 3.14;
        double y = -10;
        // double z = Math.abs(y);//giá trị tuyệt đối
        // double z = Math.max(x, y);// max / min
        double z = Math.sqrt(x); // căn bậc 2 
        System.out.println(z);

    }
}
