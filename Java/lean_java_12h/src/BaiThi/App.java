package BaiThi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // boolean flag = false;
        // int a = 0;
       
        // while (!flag) {
        //     try {
        //         a = scanner.nextInt();
        //         flag = true;
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //         System.out.println("sai");
        //         flag = false;
        //         scanner.nextLine();
        //     }
        // }
        // System.out.println(a);
        String name = scanner.nextLine();
        parent parent =  new parent(name);
        parent.setName(name);
        System.out.println(parent.getName());
    }
}
