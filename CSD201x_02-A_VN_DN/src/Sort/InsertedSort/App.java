package Sort.InsertedSort;

public class App {
    public static void main(String[] args) {
        int[] array = {7,2,8,1,9,0};
        insertedSort(array);
        showArray(array);
    }

    public static int[] insertedSort(int[] insertedSortArray) {
        int lengthArray = insertedSortArray.length;
        for (int i = 0; i < lengthArray ; i++) {
            // tạo biến lấy giá trị làm mốc
            int index = insertedSortArray[i];
            // dùng vòng lặp so sánh giá trị tại i
            int j = i - 1;
            for (; j >= 0; j--) {
                if (insertedSortArray[j] > index) {
                    // di chuyễn [j] sang bên phải
                    insertedSortArray[j + 1] = insertedSortArray[j];
                } else {
                    break;
                }
            }
            insertedSortArray[j + 1] = index;
        }
        return insertedSortArray;

    }
    public static void showArray(int [] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
