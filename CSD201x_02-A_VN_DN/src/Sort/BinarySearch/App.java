package Sort.BinarySearch;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] arrayIntegers = { 9, 3, 5, 6, 1, 2, 4 };
        for (int i = 0; i < arrayIntegers.length; i++) {
            // gán giá trị của mảng vào biến tạm "current" để làm mốc
            int current = arrayIntegers[i];
            // khai báo chỉ mục phía trước(bên trái)
            int j = i - 1;
            while (j >= 0 && arrayIntegers[j] > current) {
                // hoán đổi 2 vị trí trong mảng
                arrayIntegers[j + 1] = arrayIntegers[j];
                // giảm "j" xuống 1 đơn vị để tiếp tục kiểm tra
                j--;
            }
            // đặt giá trị vào chỉ mục của mảng
            arrayIntegers[j + 1] = current;
        }
        System.out.println(Arrays.toString(arrayIntegers));

        int length = arrayIntegers.length - 1;
        
        int search = binarySearch(arrayIntegers, 0, length, 90);
        if (search!=-1) {
            System.out.println(binarySearch(arrayIntegers, 0, length, 90));
        }else{
            System.out.println("Not found");
        }
    }

    public static int binarySearch(Integer[] arrayIntegers, int left, int right, int x) {
        // Kiểm tra chặn dưới "left" và chặn trên "right" nếu "left > right" thì trả về
        // -1
        if (left <= right) {
            // Xác định một nửa mảng
            int mid = left + ((right - left) / 2);
            // Kiểm tra giá trị ở giữa của mảng (arrayIntegers[mid]) có bằng với giá trị
            // cần tiềm (x) không
            if (arrayIntegers[mid] == x) {
                // Nếu bằng thì in vị trí của giá trị cần tìm trong mảng
                return mid;
            }
            // Kiểm tra giá trị cần tìm có lớn hơn hoặc nhỏ hơn vị trí ở giữa không
            if (arrayIntegers[mid] < x) {
                // => giá trị cần tìm nằm ở nửa trên
                return binarySearch(arrayIntegers, mid + 1, right, x);
            } else {
                // => giá trị cần tìm nằm ở nửa dưới
                return binarySearch(arrayIntegers, left, mid - 1, x);
            }
        }else{

            return -1;
        }
    }

}
