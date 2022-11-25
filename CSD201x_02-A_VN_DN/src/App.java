import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] arrayIntegers = { 9, 3, 5, 6, 1, 2, 4 };
        for (int i = 0; i < arrayIntegers.length; i++) {
            // gán giá trị của mảng vào biến tạm "current" để làm mốc
            int current = arrayIntegers[i];
            // khai báo chỉ mục phía trước
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

        // int length = arrayIntegers.length-1;
        // System.out.println(binarySearch(arrayIntegers, 0, length, 9));
        int index = linearSearch(arrayIntegers, 5);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("không tim thay");
        }

    }

    public static int binarySearch(Integer[] arrayIntegers, int left, int right, int x) {
        // Kiểm tra chặn dưới "left" và chặn trên "right" nếu "left > rigth" thì trả vè -1
        if (left <= right) {
            // Xác định một nữa mảng
            int mid = left + ((right - left) / 2);
            // Kiểm tra giá trị ở giữa của mảng (arrayIntegers[mid]) có bằng với giá trị
            // cần tiềm (x) không
            if (arrayIntegers[mid] == x) {
                // Nếu bằng thì in vị trí của giá trị cần tìm trong mảng
                return mid;
            }
            // Kiểm tra giá trị cần tìm có lơn hơn hoặc nhỏ hơn vị trí ở giữa không
            if (arrayIntegers[mid] < x) {
                // => giá trị cần tìm nằm ở nữa trên
                return binarySearch(arrayIntegers, mid + 1, right, x);
            } else {
                // => giá trị cần tìm nằm ở nữa dưới
                return binarySearch(arrayIntegers, left, mid - 1, x);
            }
        }
        return -1;
    }

        /**
         * @param arrayIntegers
         * @param key
         * @return
         */
        public static int linearSearch(Integer[] arrayIntegers, int key) {
            //B1: duyệt qua các phần tử của mảng
            for (int i = 0; i < arrayIntegers.length; i++) {
                // B2: kiểm tra phần tử của mảng == "key" 
                //nếu không tìm thấy chuyển sang Bước 4
                if (arrayIntegers[i] == key) {
                    // B3: Đúng in ra vị trị của "Key"
                    return i;
                }
            }
            // B4: Sai in ra không tìm thấy
            return -1;
        }
    }