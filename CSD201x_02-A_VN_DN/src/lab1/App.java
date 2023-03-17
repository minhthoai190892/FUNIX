package lab1;

public class App {
    public static void main(String[] args) {
        // int[] array = { 2, 1, 6, 5, 7, 9, 8 };
        // show(array);
        // bubbleSort(array);
        // show(array);
        // selectionSort(array);
        // insertSort(array);
        // show(array);
        // search(array, 2);
        LinkedList linkedList = new LinkedList();
        linkedList.insertHead(10);
        linkedList.insertHead(10);
        linkedList.insertHead(10);
        linkedList.insertHead(10);
        System.out.println(linkedList.length());
    }

    private static void insertSort(int[] array) {
        System.out.println("Inset");
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    public static void search(int[]array,int x) {
        int n = array.length;
        
        for (int i = 0; i < n; i++) {
            if (array[i]==x) {
                System.out.println("element: "+i);
            }
        }
    }
    private static void selectionSort(int[] array) {
        System.out.println("Select");
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void bubbleSort(int[] array) {
        System.out.println("Bubble SOrt");
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
