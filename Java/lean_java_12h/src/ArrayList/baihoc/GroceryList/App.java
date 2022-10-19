package ArrayList.baihoc.GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();

                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
                default:

                    break;
            }
        }
    }

    private static void processArrayList() {
        System.err.println("Process ArrayList");
        // tạo mới arrayList
        ArrayList<String> newArrayList = new ArrayList<>();
        // thêm groceryList vào arrayList mới
        newArrayList.addAll(groceryList.getGroceryList());
        // !chuyển ArrayList sang mảng thông thường
        // tạo array với độ dài của arrayList
        String array[] = new String[groceryList.getGroceryList().size()];
        // copy dữ liệu từ arrayList sang array
        array = groceryList.getGroceryList().toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grecery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    private static void removeItem() {
        System.out.print("Enter item number: ");
        String noItem = scanner.nextLine();
        // scanner.nextLine();
        groceryList.removeGroceryItem(noItem);
    }

    private static void modifyItem() {
        System.out.print("Current item name: ");
        String noItem = scanner.nextLine();

        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(noItem, newItem);
    }

    private static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of grocery item.");
        System.out.println("\t2 - To add an item to list.");
        System.out.println("\t3 - To modify an item int the list.");
        System.out.println("\t4 - To remove an item form the list.");
        System.out.println("\t5 - To search for an item in the list.");
        System.out.println("\t6 - display Grocery List");
        System.out.println("\t7 - To quit the application");
    }

}
