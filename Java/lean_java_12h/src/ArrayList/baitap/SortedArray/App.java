package ArrayList.baitap.SortedArray;

public class App {
    public static void main(String[] args) {

        // khai báo array
        int[] myArray = SortedArray.array(5);
        // khai báo 1 mảng để sắp xếp
        int[] sortArray = SortedArray.sortedArray(myArray);
        // in lại mảng đã được sắp xếp
        SortedArray.printArray(sortArray);

    }
}
