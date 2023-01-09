package Sort.bubbleSort;

public class App {
    public static void main(String[] args) {
        bubbleSort bubbleSort = new bubbleSort();
        //int[] array = bubbleSort.arrayBubbleSort(5);
        int[] array = {2 ,3 ,4 ,1 ,76, 2 ,3 ,4};
        bubbleSort.sortArray(array);
        bubbleSort.showArray(array);

       
    }
}
