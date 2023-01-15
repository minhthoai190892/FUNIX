import java.util.Scanner;

public class App {
    private static final String INPUT = "INPUT.TXT";

    private static Scanner scanner = new Scanner(System.in);

    /*
     * So Sánh
     * - Dữ liệu sắp xếp theo thứ tự ngược lại  Selection sort nhanh hơn
     * - Dữ liệu đã được sắp xếp Selection sort nhanh hơn
     * - Dữ liệu có xáo trộn ngẫu nhiên. Selection sort nhanh hơn
     *  
     */
    public static void main(String[] args) throws Exception {
        Assignment assignment = new Assignment();
        // int[] array = { 9, 3, 5, 6, 1, 2, 4 };

        int n = 0;

        Option option = new Option();
        while (true) {

            option.option();
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            if (choice == 0) {

                break;

            }
            switch (choice) {

                case 1:
                    System.out.print("Enter n: ");
                    n = scanner.nextInt();
                    scanner.nextLine();
                    int[] array = new int[n];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = scanner.nextInt();
                        // writeFile(INPUT, array[i], n);
                        assignment.writeFile(INPUT, array[i], n);
                    }
                    break;
                case 2:
                    float[] arrayFloat = assignment.readFile(INPUT, n);
                    for (int i = 0; i < arrayFloat.length; i++) {
                        System.out.print(arrayFloat[i] + " ");
                    }
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Bubble sort");
                    float[] bubbleSort = assignment.readFile(INPUT, n);
                    assignment.bubbleSort(bubbleSort);
                    System.out.println();

                    break;
                case 4:
                    System.out.println("Selection sort");
                    float[] selectionSort = assignment.readFile(INPUT, n);
                    assignment.selectionSort(selectionSort);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Insertion sort  ");
                    float[] insertionSort = assignment.readFile(INPUT, n);
                    assignment.insertionSort(insertionSort);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Linear Search  ");
                    float[] searchArray = assignment.readFile(INPUT, n);
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    assignment.linearSearch(searchArray, value);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Binary Search ");

                    float[] binarySearchArr = assignment.readFile(INPUT, n);
                    System.out.print("Enter value: ");
                    int biValue = scanner.nextInt();
                    System.out.println("Nhập khoảng tìm kiếm:");
                    System.out.print("Nhập left: ");
                    int left = scanner.nextInt();
                    System.out.print("Nhập right: ");
                    int right = scanner.nextInt();
                    int x = assignment.binarySearch(binarySearchArr, left, right, biValue);
                    if (x != -1) {
                        System.out.println("Indext of fist element: " + x);
                    } else {
                        System.out.println("Not found");
                    }
                    System.out.println();
                    break;

                default:
                    break;
            }

        }
    }
}
