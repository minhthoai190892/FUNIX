import java.util.Scanner;

public class Funix {
    public static void main(String[] args) throws Exception {
        // int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Min value " + myMinIntValue);
        System.out.println("Max value " + myMaxIntValue);
        System.out.println("============= Byte ===============");
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min value " + myMinByteValue);
        System.out.println("Max value " + myMaxByteValue);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);
        System.out.println("============= Short ===============");
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min value " + myMinShortValue);
        System.out.println("Max value " + myMaxShortValue);

        System.out.println("============= Long ===============");
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Min value " + myMinLongValue);
        System.out.println("Max value " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("bigLongLiteralValue: " + bigLongLiteralValue);

        System.out.println("=============== 28. Primitive Types Challenge =================");
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 5000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
        short shortTotal = (short) (5000L + 10L * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);

        // 29. float and double Primitive Types
        System.out.println("=============== 29. float and double Primitive Types =================");
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("myMinFloatValue: " + myMinFloatValue);
        System.out.println("myMaxFloatValue: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("myMinDoubleValue: " + myMinDoubleValue);
        System.out.println("myMaxDoubleValue: " + myMaxDoubleValue);

        int myIntVlaue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
        System.out.println("myIntVlaue: " + myIntVlaue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);



        System.out.println("=============== 71. Parsing Values from a String =================");









        System.out.println("=============== 72. Reading User Input =================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();// sử lý ký tự của dòng tiếp theo - phím "Enter"
        int age = 2022 - yearOfBirth;
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name + ", and you are " + age + " years old");
        scanner.close();
    }
}
