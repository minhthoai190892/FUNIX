
import java.util.Scanner;

// import java.util.Random;
// import java.util.Scanner;

// import javax.swing.JOptionPane;

// import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Scanner scanner = new Scanner(System.in);

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

        // System.out.println("================== Math Class
        // ==========================");

        // // double x = 3.14;
        // // double y = -10;
        // // // double z = Math.abs(y);//giá trị tuyệt đối
        // // // double z = Math.max(x, y);// max / min
        // // double z = Math.sqrt(x); // căn bậc 2
        // // System.out.println(z);
        // // tinh canh huyen
        // double x, y, z;
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter X: ");
        // x = scanner.nextDouble();
        // System.out.println("Enter Y: ");
        // y = scanner.nextDouble();
        // z = Math.sqrt((x * x) + (y * y));
        // System.out.println("The hypotenuse is: " + z);
        // scanner.close();

        // System.out.println("================== Random number
        // ==========================");
        // tao doi tuong random
        // Random random = new Random();
        // int x = random.nextInt(4);
        // // double x = random.nextDouble();
        // System.out.println(x);
        // Random generator = new Random();
        int code = (int) Math.floor(((Math.random() * 899999) + 100000));
        System.out.println(code);
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        if (a == code) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
        // https://www.youtube.com/watch?v=hGxsRJYmsQs
        scanner.close();
        // System.out.println("Random Long: " + generator.nextLong());
        // System.out.println("Random Float: " + generator.nextFloat());
        // System.out.println("Random Double: " + generator.nextDouble());
        // System.out.println("Random Boolean: " + generator.nextBoolean());
        // byte[] bytes = "gpcoder.com".getBytes();
        // System.out.println("Before Random Bytes : " + new String(bytes));
        // generator.nextBytes(bytes);
        // System.out.println("After Random Bytes : " + new String(bytes));
        // System.out.println("================== While ==========================");
        // Scanner scanner = new Scanner(System.in);
        // String name = "";
        // while (name.isEmpty()) {
        // System.out.println("Enter your name: ");
        // name = scanner.nextLine();
        // }
        // System.out.println("Hello " + name);
        // scanner.close();

        // System.out.println("================== For ==========================");

        // for (int i = 0; i < 10; i++) {
        // System.out.println(i+1);
        // }
        // for (int i = 10; i >= 0; i--) {
        // System.out.println(i);

        // }
        // System.out.println("game over");

        // int rows, columns;
        // String symbol = "";
        // System.out.println("Enter # of rows: ");
        // rows = scanner.nextInt();
        // System.out.println("Enter # of columns: ");
        // columns = scanner.nextInt();
        // System.out.println("Enter symbol to use: ");
        // symbol = scanner.next();
        // for (int i = 1; i <= rows; i++) {
        // System.out.println();
        // for (int index = 1; index <= columns; index++) {
        // System.out.println(symbol);
        // }
        // }

        System.out.println("================== Array ==========================");
        // khi báo mãng
        // String[] car = { "camaro", "tesla", "ford" };
        // for (int i = 0; i < car.length; i++) {
        // System.out.println(car[i]);

        // }
        // car[0] = "lambo";
        // System.out.println(car[0]);

        // for (int i = 0; i < car.length; i++) {
        // System.out.println(car[i]);
        // }
        // // 2D array
        // String a = "001";
        // String[][] car1 = { { "001", "002", "003" }, { "Ha NOi", "Ho Chi Minh",
        // "Ca Mau" },
        // };
        // for (int i = 0; i < car1.length; i++) {
        // // System.out.println(car1[i]);
        // System.out.println();
        // for (int j = 0; j < car1[i].length; j++) {
        // System.out.print(car1[i][j] + " ");
        // }

        // }
        // int random = (int) Math.random();
        // System.out.println(random);

        // System.out.println("================== String method
        // ==========================");
        // String name = "Bro ";
        // // boolean result = name.equals("asdf");
        // // boolean result = name.equalsIgnoreCase("bro");
        // // int result = name.length();
        // // char result = name.charAt(0);
        // // int result = name.indexOf("r");
        // // boolean result = name.isEmpty();
        // // String result = name.toLowerCase();
        // // String result = name.toUpperCase();
        // // String result = name.trim();
        // String result = name.replace("B", "P");
        // System.out.println(result);

    }
}
