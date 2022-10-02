
import java.util.Scanner;

// import java.util.Scanner;
// import java.util.UUID;

public class Funix {
    public static void main(String[] args) throws Exception {
        // ! System.out.println("======== =======");

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

        System.out.println("=============== 28. Primitive Types Challenge =================");
        // byte byteValue = 10;
        // short shortValue = 20;
        // int intValue = 50;

        // long longTotal = 5000L + 10L * (byteValue + shortValue + intValue);
        // System.out.println(longTotal);
        // short shortTotal = (short) (5000L + 10L * (byteValue + shortValue +
        // intValue));
        // System.out.println(shortTotal);

        // // 29. float and double Primitive Types
        System.out.println("=============== 29. float and double Primitive Types =================");
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

        // int a = 10, b = 20;
        // int result = a + b; // 30

        // System.out.println("10+20 =" + result);
        // result %= 3; // 30%3 = 0
        // System.out.println(result);

        System.out.println("=============== 34. Abbreviating Operators =================");
        // result++; // 0+1=1
        // System.out.println(result);
        // result += 2;
        // System.out.println(result);
        // result *= 10;
        // System.out.println(result);

        System.out.println("=============== 35. if-then Statement =================");
        // boolean isAlien = false;
        // if (isAlien != false) {
        // System.out.println("It is not an alient!");
        // }
        // System.out.println("It is an alient!");
        System.out.println("=============== 36. Logical and Operator =================");

        // int topScore = 80;
        // int secondScore = 60;
        // if (topScore > 70 && secondScore > 50) {
        // System.out.println("Score 60 - 80");

        // }
        System.out.println("=============== 38. Assignment Operator VS Equals to Operator =================");
        // int value = 50;
        // if (value == 50) {

        // }
        // boolean isCar = false;
        // if (isCar == true) {
        // System.out.println(isCar);
        // }
        System.out.println("=============== 39. Ternary Operator =================");
        // boolean wasCar = isCar ? true : false;
        // System.out.println(wasCar);
        // int valueNumber = 20;
        // boolean checkNumber = valueNumber == 2 ? true : false;
        // System.out.println(checkNumber);
        System.out.println("=============== 40. Operator Precedence and Operator Challenge =================");
        // // 1. create a double variable with a value of 20.00
        // double myFirstValue = 20.00d;
        // // 2. create a second variable with a value of 80.00
        // double mySecondValue = 80.00d;
        // // 3. add both numbers together and multiply by 100.00
        // double myValuesTotal = myFirstValue + mySecondValue;
        // System.out.println("myValuesTotal: " + myValuesTotal);
        // /*
        // * 4. use the remainder operator to figure out what the remainder from the
        // * result of the
        // * operation in step 3 and 40.00. We used the modulus or remainder operator on
        // * ints in the course, but we can also
        // * use it on a double
        // *
        // *
        // */
        // double theRemainder = myValuesTotal % 40.00d;
        // System.out.println("theRemainder: " + theRemainder);
        // // 5. Create a boolen variable that assgins the value true if the remainder
        // in
        // // #4 is 0, or false if its not zero
        // boolean isNoRemainder = theRemainder == 0 ? true : false;
        // System.out.println("isNoRemainder: " + isNoRemainder);

        // /*
        // *
        // * 7. Write an "if-then" statement that displays a message "Got some
        // remainder"
        // * if the boolen in step5 "is not true".
        // * Don't be surprised if you see output for this step, where your might expect
        // * it not to show.
        // * i'll explain it my soluion
        // *
        // */
        // if (!isNoRemainder) {
        // System.out.println("Got some remainder");

        // }

        System.out.println("=============== 48. Methods In Java =================");

        // goi ham
        // int a = calculateScore(true, 10000, 8, 200);
        // System.out.println(a);
        //
        /*
         * Create a method called displayHighScorePosition
         * it should a players name as a parmeter, and a 2nd parameter as a position
         * in the hight score table
         * 
         * you should display the players name along with a message like
         * "managed to get into position"
         * and the position they got and a further messgae "on the high score table"
         * create a 2nd method called calculateHighScorePosition
         * it should be sent one argument only, the player score
         * it should return an int
         * the return data should be
         * 1 if the score is > 1000
         * 2 if the score is >500 and <1000
         * 3 if the score is >100 and <500
         * 5 in all other cases
         * call both methods and display the resultes of the following
         * a score of 1500, 900, 400 and 50
         */
        // goi ham nhp diem
        // int highScore = calculateHighScorePosition(1550);
        // // goi ham hien thi ten va diem
        // displayHighScorePosition("Thoai", highScore);
        System.out.println("=============== 63. The switch statement (+Challenge Exercise) =================");
        // switchTest("e");
        // printDayOfTheWeek(0);
        // printDayOfTheWeek(1);
        // printDayOfTheWeek(2);
        // printDayOfTheWeek(3);
        // printDayOfTheWeek(4);
        // printDayOfTheWeek(5);
        // printDayOfTheWeek(6);
        // printDayOfTheWeek(7);
        //
        System.out.println("=============== 65. The for Statement (+Challenge Exercise) =================");
        /*
         * using the "for" statement, call the calculateInterest method with
         * the "amount" of 10000 with an interesRate of 2->8 and print the results
         * 
         */
        // for (int i = 2; i < 9; i++) {
        // System.out.println("10000 at " + i + " % interest " + String.format("%.2f",
        // calculateInterest(10000, i)));
        // }

        // int count = 0;
        // for (int i = 10; i < 50; i++) {
        // if (isPrime(i)) {
        // count++; // * tăng "count" lên một
        // System.out.println("Number " + i + " is a prime number");
        // if (count == 3) {// ! kiểm tra nếu count tăng lên 3 thì thoát vòng lập
        // System.out.println("Exiting for loop");
        // break;
        // }
        // }
        // }
        //
        System.out.println("=============== 66. For Loop Recap =================");
        //
        System.out.println("=============== 67. Sum 3 and 5 Challenge =================");
        // methodSum(1000);
        System.out.println(
                "=============== 68. The while and do while statements (+Challenge Exercise) =================");
        // int count = 1;
        // while (count != 6) {
        // System.out.println(count);
        // count++;
        // }
        // System.out.println("---");
        // for (int i = 1; i < 7; i++) {
        // System.out.println(count);
        // }
        // while (true) {
        // if (count == 10) {
        // break;
        // } // ! =>
        // System.out.println(count);
        // count++;
        // }
        // System.out.println("----");
        // do {
        // System.out.println(count);
        // count++;
        // } while (count != 10);
        // int number = 4;
        // int finisNumber = 20;
        // int evenNumbersFound = 0;
        // while (number <= finisNumber) {
        // number++;
        // if (!IsEvenNumber(number)) {
        // continue;
        // }
        // evenNumbersFound++;
        // if (evenNumbersFound >= 5) {
        // break;
        // }
        // System.out.println("Even number " + number);
        // }
        // System.out.println("Even Number Found " + evenNumbersFound);
        System.out.println("=============== 71. Parsing Values from a String =================");
        // String numberAsString = "2018";
        // System.out.println(numberAsString);
        // int number = Integer.parseInt(numberAsString);
        // System.out.println(number);

        System.out.println("=============== 72. Reading User Input =================");
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

        System.out.println("=============== 99. Arrays ===============");
        // tao mang
        // int[] myInArray = new int[10];
        // int[] myInArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // for (int i = 0; i < myInArray.length; i++) {
        // myInArray[i] = i * 10;
        // }
        // for (int i = 0; i < 10; i++) {
        // System.out.println(myInArray[i]);
        // }
        // printArray(myInArray);
        // int[] myIntegerArray = getIntegers(6);
        // for (int i = 0; i < myIntegerArray.length; i++) {
        // System.out.println("Element " + i + " typed value was " + myIntegerArray[i]);
        // }
        // System.out.println("The average is " + getAverage(myIntegerArray));
        System.out.println("===============  102. References Types vs Value Types  ===============");
        // int a = 10;
        // int b = a;
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        // a++;
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        // int[] array1 = new int[5];
        // int[] array2 = array1;
        // System.out.println("array1 = " + Arrays.toString(array1));
        // System.out.println("array2 = " + Arrays.toString(array2));
        // array2[1]=10;
        // System.out.println("array1 = " + Arrays.toString(array1));
        // System.out.println("array2 = " + Arrays.toString(array2));
        
        System.out.println("======== 105. List and ArrayList Part 1 =======");
            
        // System.out.println("===============  ===============");
        

        System.out.println("=============== 141. Naming Conventions =================");
        //
        // UUID uuid = UUID.randomUUID();
        // System.out.println("UUID: " + uuid.toString());
    }

    // System.out.println("=============== 48. Methods In Java =================");
    /**
     * 
     * @param gameOver      true
     * @param score         =10000
     * @param levelComplete 8
     * @param bounus        200
     * @return
     */
    // public static void calculateScore(boolean gameOver, int score, int
    // levelComplete, int bounus) {
    // if (gameOver) { //gameOver = true
    // int finalScore = score + (levelComplete * bounus);//10000+1600
    // //"finalScore" tang len 1000
    // finalScore += 1000;
    // System.out.println("Youre final score was " + finalScore);
    // }
    // }
    // su dung "return" khai bao ham dung voi "kieu du lieu" tra ve
    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bounus) {
        if (gameOver) { // gameOver = true
            int finalScore = score + (levelComplete * bounus);// 10000+1600
            // "finalScore" tang len 1000
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    // display name and highscore
    /**
     * 
     * @param name              ten nguoi dung nhap vao
     * @param highScorePosition vi tri diem cao nhat
     */
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out
                .println(
                        playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    // ham tinh diem cao nhat
    /**
     * ham nhap Score
     * 
     * @param playerScore
     * @return
     */
    public static int calculateHighScorePosition(int playerScore) {
        // if (playerScore >= 1000) {
        // return 1;
        // } else if (playerScore >= 500) {
        // return 2;
        // } else if (playerScore >= 100) {
        // return 3;
        // }
        // return 4;
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    // =============== 63. The switch statement (+Challenge Exercise)
    // =================
    /**
     * Create a new switch statement using char instead of int
     * create a new char variable
     * create a switch staement testing for A,B,C,D,E
     * display a message if any of these are found and then break
     * add a default which displays a message saying not found
     * 
     * @param charValue
     */
    public static void switchTest(String charValue) {
        switch (charValue.toUpperCase()) {
            case "A":
                System.out.println("A was found");
                break;
            case "B":
            case "C":
            case "D":
            case "E":
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Could not find A,B,C,D or E");

                break;
        }
    }

    /**
     * Print day of the week
     * 
     * @param day
     */
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
    // System.out.println("=============== 65. The for Statement (+Challenge
    // Exercise) =================");

    public static double calculateInterest(double amount, double interstRate) {

        return amount * (interstRate / 100);

    }

    /**
     * Định nghĩa: số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó.
     * 
     * Ví dụ: 2, 3, 5, 7, 11, 13, 17, ... là những số nguyên tố.
     * 
     * Chú ý: Số 0 và 1 không phải là số nguyên tố. Chỉ có số 2 là số nguyên tố
     * chẵn, tất cả các số chẵn khác không phải là số nguyên tố vì chúng chia hết
     * cho 2.
     * ! (n/2) => 10/2 = 5 => for run to 2 form 5
     * 
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void methodSum(int n) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }

    // System.out.println(
    // "=============== 68. The while and do while statements (+Challenge Exercise)
    // =================");
    /**
     * Create a method called isEvenNumber that takes a parameter of type int
     * Its purpose is to determine if the argument passed to the method is an even
     * number or not.
     * return true if an even number, otherwise return false
     * 
     * @param number
     * @return
     */
    public static boolean IsEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    // System.out.println("======== 99. Arrays =======");
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + "values is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {

        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;

    }

    public static double getAverage(int[] array) {
        // tao bien sum de tinh tong
        int sum = 0;
        // duyet mang de lay tung phan tu va tinh tong
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // lay bien sum cong moi lan lap cua array
        }
        return (double) (sum / array.length);

    }

    private static Scanner scanner = new Scanner(System.in);
    // System.out.println("======== 105. List and ArrayList Part 1 =======");


}
