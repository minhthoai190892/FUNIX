import java.util.Scanner;

public class Funix {
    public static void main(String[] args) throws Exception {
        // int myValue = 10000;
        // int myMinIntValue = Integer.MIN_VALUE;
        // int myMaxIntValue = Integer.MAX_VALUE;
        // System.out.println("Min value " + myMinIntValue);
        // System.out.println("Max value " + myMaxIntValue);
        // System.out.println("============= Byte ===============");
        // byte myMinByteValue = Byte.MIN_VALUE;
        // byte myMaxByteValue = Byte.MAX_VALUE;
        // System.out.println("Min value " + myMinByteValue);
        // System.out.println("Max value " + myMaxByteValue);
        // byte myNewByteValue = (byte) (myMinByteValue / 2);
        // System.out.println(myNewByteValue);
        // System.out.println("============= Short ===============");
        // short myMinShortValue = Short.MIN_VALUE;
        // short myMaxShortValue = Short.MAX_VALUE;
        // System.out.println("Min value " + myMinShortValue);
        // System.out.println("Max value " + myMaxShortValue);

        // System.out.println("============= Long ===============");
        // long myMinLongValue = Long.MIN_VALUE;
        // long myMaxLongValue = Long.MAX_VALUE;
        // System.out.println("Min value " + myMinLongValue);
        // System.out.println("Max value " + myMaxLongValue);
        // long bigLongLiteralValue = 2_147_483_647_234L;
        // System.out.println("bigLongLiteralValue: " + bigLongLiteralValue);

        // System.out.println("=============== 28. Primitive Types Challenge
        // =================");
        // byte byteValue = 10;
        // short shortValue = 20;
        // int intValue = 50;

        // long longTotal = 5000L + 10L * (byteValue + shortValue + intValue);
        // System.out.println(longTotal);
        // short shortTotal = (short) (5000L + 10L * (byteValue + shortValue +
        // intValue));
        // System.out.println(shortTotal);

        // // 29. float and double Primitive Types
        // System.out.println("=============== 29. float and double Primitive Types
        // =================");
        // float myMinFloatValue = Float.MIN_VALUE;
        // float myMaxFloatValue = Float.MAX_VALUE;
        // System.out.println("myMinFloatValue: " + myMinFloatValue);
        // System.out.println("myMaxFloatValue: " + myMaxFloatValue);

        // double myMinDoubleValue = Double.MIN_VALUE;
        // double myMaxDoubleValue = Double.MAX_VALUE;
        // System.out.println("myMinDoubleValue: " + myMinDoubleValue);
        // System.out.println("myMaxDoubleValue: " + myMaxDoubleValue);

        // int myIntVlaue = 5;
        // float myFloatValue = 5f;
        // double myDoubleValue = 5d;
        // System.out.println("myIntVlaue: " + myIntVlaue);
        // System.out.println("myFloatValue: " + myFloatValue);
        // System.out.println("myDoubleValue: " + myDoubleValue);

        System.out.println("=============== 33. Operators, Operands and Expressions =================");

        int a = 10, b = 20;
        int result = a + b; // 30

        System.out.println("10+20 =" + result);
        result %= 3; // 30%3 = 0
        System.out.println(result);

        System.out.println("=============== 34. Abbreviating Operators =================");
        result++; // 0+1=1
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);

        System.out.println("=============== 35. if-then Statement =================");
        boolean isAlien = false;
        if (isAlien != false) {
            System.out.println("It is not an alient!");
        }
        System.out.println("It is an alient!");
        System.out.println("=============== 36. Logical and Operator =================");

        int topScore = 80;
        int secondScore = 60;
        if (topScore > 70 && secondScore > 50) {
            System.out.println("Score 60 - 80");

        }
        System.out.println("=============== 38. Assignment Operator VS Equals to Operator =================");
        int value = 50;
        if (value == 50) {

        }
        boolean isCar = false;
        if (isCar == true) {
            System.out.println(isCar);
        }
        System.out.println("=============== 39. Ternary Operator =================");
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);
        int valueNumber = 20;
        boolean checkNumber = valueNumber == 2 ? true : false;
        System.out.println(checkNumber);
        System.out.println("=============== 40. Operator Precedence and Operator Challenge =================");
        // 1. create a double variable with a value of 20.00
        double myFirstValue = 20.00d;
        // 2. create a second variable with a value of 80.00
        double mySecondValue = 80.00d;
        // 3. add both numbers together and multiply by 100.00
        double myValuesTotal = myFirstValue + mySecondValue;
        System.out.println("myValuesTotal: " + myValuesTotal);
        /*
         * 4. use the remainder operator to figure out what the remainder from the
         * result of the
         * operation in step 3 and 40.00. We used the modulus or remainder operator on
         * ints in the course, but we can also
         * use it on a double
         * 
         * 
         */
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder: " + theRemainder);
        // 5. Create a boolen variable that assgins the value true if the remainder in
        // #4 is 0, or false if its not zero
        boolean isNoRemainder = theRemainder == 0 ? true : false;
        System.out.println("isNoRemainder: " + isNoRemainder);

        /*
         *
         * 7. Write an "if-then" statement that displays a message "Got some remainder"
         * if the boolen in step5 "is not true".
         * Don't be surprised if you see output for this step, where your might expect
         * it not to show.
         * i'll explain it my soluion
         * 
         */
        if (!isNoRemainder) {
            System.out.println("Got some remainder");

        }

        System.out.println("=============== 48. Methods In Java =================");





        // 
        // System.out.println("=============== 71. Parsing Values from a String
        // =================");
        // String numberAsString = "2018";
        // System.out.println(numberAsString);
        // int number = Integer.parseInt(numberAsString);
        // System.out.println(number);

        // System.out.println("=============== 72. Reading User Input
        // =================");
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your year of birth: ");
        // int yearOfBirth = scanner.nextInt();
        // scanner.nextLine();// sử lý ký tự của dòng tiếp theo - phím "Enter"
        // int age = 2022 - yearOfBirth;
        // System.out.println("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("Your name is: " + name + ", and you are " + age + " years
        // old");
        // scanner.close();
        // System.out.println("=============== 141. Naming Conventions
        // =================");

        //
       
    }
   
  
}
