package BaiThi.Baitap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = scanner.nextInt();
        // double r = scanner.nextDouble();
        // int n = scanner.nextInt();
        // increasingordecreasing(a, b, c);
        ArrayList<String> listString = new ArrayList<>();
        listString.add("asdasdqwe");
        listString.add("1");
        listString.add("qwe");
        Collections.sort(listString, ((o1, o2) ->o2.compareTo(o1) ));
        System.out.println(listString);
        ArrayList<Integer> listint = new ArrayList<>();
        listint.add(1);
        listint.add(50);
        listint.add(20);
        listint.add(40);
        listint.sort((o1, o2) -> o2-o1 );
        System.out.println(listint);
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Integer[] array = { 13, 7, 6, 45, 21, 9, 2, 100 };
 
        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(array, Collections.reverseOrder());
 
        // Printing the array as generated above
        System.out.println("Modified arr[] : "
                           + Arrays.toString(array));
        
                           // maxValue(a, b, c);
        // rangeValue(a);
        System.out.println("-------------");
        Integer[] arrayInt ={ 13, 7, 6, 45, 21, 9, 2, 100 };
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]+ " ");
        }
        Arrays.sort(arrayInt,Collections.reverseOrder());
        System.out.println();
        for (Integer integer : arrayInt) {
            System.out.print(integer +" ");
        }
        // notKhong(a, b);

        // System.out.println(circumference(r));

        // System.out.println(factorial(n));

        // System.out.println(sum(n));

        // int[] array = new int[n];
        // for (int i = 0; i < array.length; i++) {
        // array[i] = scanner.nextInt();
        // }
        // System.out.println(sumOfArray(array, n));

        // for (int i = n; i >= -n; i--) {
        // System.out.print(i + " ");
        // }
        // sumFromAToB(a, b);
        // chiaHet3(a, b);
        // tinhGiaiThua(n);
        // showChan(n);
        // uocSo(n);
        // chiaHetCho3va5(a, b);
        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= 10; j++) {
        // System.out.print(i * j + " ");
        // }
        // System.out.println();
        // }
        // String[] array = new String[n];
        // int[] array = new int[n];
        // for (int i = 0; i < n; i++) {
        //     array[i] = scanner.nextInt();
        // }
        // int k = scanner.nextInt();

        // inputArray(array);
        // maxValueOfArray(array);
        // System.out.println(array[0] + array[n - 1]);
        // chiaHet2(array);
        // timK(array, k);
        // tongLonHon0(array);
        // show3(array);
        // uocSo(n);
    }

    public static void show3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] <= 10) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void tongLonHon0(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void timK(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void chiaHet2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

    }

    public static void maxValueOfArray(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void show2(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 3) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] % 5 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void chiaHetCho3va5(int a, int b) {
        // for (int i = a; i <= b; i++) {
        // if (i % 3 == 0 && i % 5 == 0) {
        // System.out.println(i);
        // }
        // }
        while (a <= b) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }

    public static void uocSo(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static void showChan(int n) {
        while (n <= 100) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }

    public static void tinhGiaiThua(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        System.out.println(answer);
    }

    public static void chiaHet3(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void sumFromAToB(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void increasingordecreasing(int a, int b, int c) {
        if (a >= b && b >= c) {
            System.out.println("decreasing");
        } else if (a <= b && b <= c) {
            System.out.println("increasing");

        } else {
            System.out.println("neither increasing nor decreasing order");
        }
    }

    public static void maxValue(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("a" + a);
        } else if (b >= c) {
            System.out.println("b" + b);
        } else {
            System.out.println("c" + c);
        }
    }

    public static void rangeValue(int a) {
        if (a >= 10 && a <= 100) {
            System.out.println(a + " is in the range [10, 100]");
        } else {
            System.out.println(a + " is not in the range [10, 100]");
        }
    }

    public static void notKhong(int a, int b) {
        if (a != 0 && b != 0) {
            System.out.println("a is not equal to 0 and b is not equal to 0");
        } else {
            System.out.println("a is equal to 0 or b is equal to 0");
        }
    }

    public static double circumference(double r) {
        return 2 * r * 3.14;
    }

    public static int factorial(int n) {
        // điều kiện để đệ quy dừng lại
        if (n == 1) {
            return 1;
        }
        // gọi lại hàm đến khi "n" đúng với điều kiện dừng lại
        return n * factorial(n - 1);
    }

    public static int sum(int n) {
        // điều kiện dừng
        if (n == 1) {
            return 1;
        }
        // kiển tra số lẻ
        if (n % 2 == 0) {
            // nếu là chẳn thì -1 của hàm sum
            return sum(n - 1);
        } else {
            // nếu là lẻ ta tính tổng và -1 của hàm sum đến khi nào đến điều kiện dừng
            return n + sum(n - 1);
        }
    }

    public static int sumOfArray(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return array[n - 1] + sumOfArray(array, n - 1);
    }
}
