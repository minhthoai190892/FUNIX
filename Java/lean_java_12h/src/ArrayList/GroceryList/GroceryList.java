package ArrayList.GroceryList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        // todo: Thêm phần tử vào ArrayList bằng phương thức "add"
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        // cập nhật trong ArrayList
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + position + 1 + " has ben modified.");
    }

    public void removeGroceryItem(int position) {
        // lấy vị trí trong ArrayList
        String theItem = groceryList.get(position);
        // xóa
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }

        return null;

    }
}
