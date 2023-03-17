package Recursion;

public class App {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {

            int mid = left + (right - left) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] < value) {

                return binarySearch(array, mid + 1, right, value);

            } else {
                return binarySearch(array, left, mid - 1, value);
            }

        }

        return -1;

    }

    public static int convertToBinary(Stack stack, int number) {

        // điều kiện kết thúc hàm
        if (number == 0) {
            return 1;
        }
        // thêm số dư vào Stack
        stack.insertHead(number % 2); // 31/2 =15 dư 1
        // lấy thương (15) chia tiếp
        return convertToBinary(stack, number / 2);
    }

    public static void main(String[] args) {
        // int[] array = { 2, 3, 4, 1, 76, 2, 3, 4 };
        // System.out.println(binarySearch(array, 0, array.length, 76));
        Stack stack = new Stack();
        // stack.insertHead(1);
        // stack.insertHead(12);
        // stack.insertHead(13);
        // stack.insertHead(14);
        // stack.insertHead(15);
        System.out.println(stack.length());
        stack.show();
        System.out.println();
        convertToBinary(stack, 5);
        System.out.println();
        stack.show();
    }
}
