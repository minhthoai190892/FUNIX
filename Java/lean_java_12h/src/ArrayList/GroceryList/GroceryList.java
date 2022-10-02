package ArrayList.GroceryList;

import java.util.ArrayList;



public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        // todo: Thêm phần tử vào ArrayList bằng phương thức "add"
        groceryList.add(item);
    }
    //todo - Getter
    public ArrayList<String> getGroceryList(){
        return groceryList;
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        // gọi hàm "findItem"
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        // cập nhật trong ArrayList
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has ben modified.");
    }

    public void removeGroceryItem(String item) {
        // gọi hàm "findItem"
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        // xóa
        groceryList.remove(position);
    }

    /**
     * 
     * @param searchItem
     * @return int
     */
    private int findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
