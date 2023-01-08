package Sort.bubbleSort;

public class App {
    public static void main(String[] args) {
        bubbleSort bubbleSort = new bubbleSort();
        int[] array = bubbleSort.arrayBubbleSort(5);
        bubbleSort.sortArray(array);
        bubbleSort.showArray(array);

       
    }
}
