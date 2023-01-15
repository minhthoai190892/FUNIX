import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Assignment {
    private static final String INPUT1 = "INPUT1.TXT";
    private static final String INPUT2 = "INPUT2.TXT";
    private static final String INPUT3 = "INPUT3.TXT";
    private static final String INPUT4 = "INPUT4.TXT";
    private static final String INPUT5 = "INPUT5.TXT";

    /**
     * chức năng ghi file
     * 
     * @param fileName tên file
     * @param index    vị trí
     * @param length   đọ dài mảng
     */
    public void writeFile(String fileName, int index, int length) {
        // append = true: không ghe đè file
        // append = false: ghe đè file
        try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(index));
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * chức năng đọc file
     * 
     * @param fileName tên file
     * @param length   độ dài của mảng
     * @return
     */
    public float[] readFile(String fileName, int length) {
        float[] array = new float[length];
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int i = 0;

            while (true) {
                // lấy từng dòng trong file INPUT
                line = br.readLine();
                if (line == null) {
                    break;
                }
                // chuyển dữ liệu sang INT
                array[i] = Integer.parseInt(line);
                i++;
            }
            // lệnh đóng
            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }

    /**
     * chức năng tìm bubble sort
     * 
     * @param array nhận vào một mảng
     */
    public void bubbleSort(float[] array) {
        // tạo mảng mới từ file INPUT
        int n = array.length;
        float[] sortArray = new float[n];
        for (int i = 0; i < n; i++) {
            sortArray[i] = array[i];
        }
        int length = sortArray.length;
        long startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                // kiểm tra 2 số
                if (sortArray[j] > sortArray[j + 1]) {
                    // hoán đổi vị trí
                    float temp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = temp;
                }
            }

            // in lại quá trình sắp sếp
            display(sortArray);
        }
        long endTime = System.nanoTime();
        System.out.println("Thời gian thực hiện thuật toán: " + (endTime - startTime));
        // lưu kết quả sau khi sắp xếp
        for (int i = 0; i < sortArray.length; i++) {

            writeFile(INPUT1, ((int) sortArray[i]), length);
        }
    }

    /**
     * chức năng selectionSort
     * 
     * @param array nhận vào một mảng
     *              trả về kết quả đã sắp xếp
     */
    public void selectionSort(float[] array) {
        // tạo mới mảng
        // tạo mảng mới từ file INPUT
        int n = array.length;
        float[] sortArray = new float[n];
        for (int i = 0; i < n; i++) {
            sortArray[i] = array[i];
        }

        int length = sortArray.length;
        long startTime = System.nanoTime();
        for (int i = 0; i < length - 1; i++) {
            // tạo biến quả lý phần tử
            int minIndex = i;
            // duyệt mảng bắt đầu vị trí i+1
            for (int j = i + 1; j < length; j++) {
                if (sortArray[j] < sortArray[minIndex]) {
                    // gán giá trị
                    minIndex = j;
                }
            }
            // hoán vị
            float temp = sortArray[minIndex];
            sortArray[minIndex] = sortArray[i];
            sortArray[i] = temp;
            // in quá trình sắp sếp
            for (int j = 0; j < length; j++) {
                System.out.print(" " + sortArray[j]);
            }
            System.out.println();
        }
        long endTime = System.nanoTime();
        System.out.println("Thời gian thực hiện thuật toán: " + (endTime - startTime));
        // lưu kết quả sau khi sắp xếp
        for (int i = 0; i < sortArray.length; i++) {

            writeFile(INPUT2, ((int) sortArray[i]), length);
        }
    }

    /**
     * chức năng insertionSort
     * 
     * @param array
     */
    public void insertionSort(float[] array) {
        // tạo mảng mới từ file INPUT
        int n = array.length;
        float[] sortArray = new float[n];
        for (int i = 0; i < n; i++) {
            sortArray[i] = array[i];
        }
        int length = sortArray.length;
        long startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            // tạo biến làm giá trị thứ i để làm móc
            Float current = sortArray[i];
            // khai báo chỉ mục phía trước (bên trái)
            int j = i - 1;
            while (j >= 0 && sortArray[j] > current) {
                // hoán đổi 2 vị trí
                sortArray[j + 1] = sortArray[j];
                j--;
            }
            // đặt giá trị vào chỉ mục của mảng
            sortArray[j + 1] = current;
            // in quá trình sắp sếp
            display(sortArray);
        }
        long endTime = System.nanoTime();
        System.out.println("Thời gian thực hiện thuật toán: " + (endTime - startTime));
        // lưu kết quả sau khi sắp xếp
        for (int i = 0; i < sortArray.length; i++) {

            writeFile(INPUT3, ((int) sortArray[i]), length);
        }
    }

    /**
     * chức năng tìm kiếm tính tuyến
     * 
     * @param array nhận vào một mảng
     * @param value nhận vào 1 giá trị cần tìm
     * 
     */
    public void linearSearch(float[] array, int value) {
        // tạo mảng mới từ file INPUT
        int n = array.length;
        float[] sortArray = new float[n];
        for (int i = 0; i < n; i++) {
            sortArray[i] = array[i];
        }
        int length = sortArray.length;
        for (int i = 0; i < length; i++) {
            if (sortArray[i] > value) {
                System.out.print(i + " ");
                // lưu kết quả sau khi sắp xếp

                writeFile(INPUT4, ((int) i), length);

            }
        }

    }

    /**
     * @param array       nhận vào một mảng
     * @param left        khoảng cách tìm kiếm(vị trí băt đầu)
     * @param right       khoảng cách tìm kiếm(vị trí kết thúc)
     * @param searchValue giá trị cần tìm
     * @return vị trí của giá trị
     */
    public int binarySearch(float[] array, int left, int right, int searchValue) {
        // tạo mảng mới từ file INPUT
        int n = array.length;
        float[] sortArray = new float[n];
        for (int i = 0; i < n; i++) {
            sortArray[i] = array[i];
        }
        int length = sortArray.length;
        // sắp sếp lại mảng
        for (int i = 0; i < length; i++) {
            // tạo biến làm giá trị thứ i để làm móc
            Float current = sortArray[i];
            // khai báo chỉ mục phía trước (bên trái)
            int j = i - 1;
            while (j >= 0 && sortArray[j] > current) {
                // hoán đổi 2 vị trí
                sortArray[j + 1] = sortArray[j];
                j--;
            }
            // đặt giá trị vào chỉ mục của mảng
            sortArray[j + 1] = current;

        }
        int mid = 0;
        if (left <= right) {
            // xác định 1 nữa mảng
            mid = left + ((right - left) / 2);
            // kiểm tra xem giá trị tìm kiếm có nằm ở giữa không
            if (sortArray[mid] == searchValue) {
                writeFile(INPUT5, mid, length);
                return mid;
            }
            // kiểm tra xem giá trị tìm kiếm có lớn hơn hoặc nhỏ hơn vị trí mid không
            if (sortArray[mid] < searchValue) {
                return binarySearch(sortArray, mid + 1, right, searchValue);
            } else {
                return binarySearch(sortArray, left, mid - 1, searchValue);
            }

        }

        return -1;

    }

    /**
     * hàm in dữ liệu của mảng
     * 
     * @param array
     */
    public void display(float[] array) {
        int length = array.length;
        for (int j = 0; j < length; j++) {
            System.out.print(" " + array[j]);
        }
        System.out.println();
    }
}
