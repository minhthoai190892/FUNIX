package ArrayList.baihoc.GroceryList;

import java.util.ArrayList;

public class GroceryList {
    // khởi tạo "ArrayList"
    private ArrayList<String> groceryList = new ArrayList<>();

    /**
     * 
     * @param item
     *             thêm vào danh sách
     */
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        // sử dụng vòng lặp for để in ra các phần tử có trong arraylist
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        // tạo biến nhận giá trị của hàm findItem
        int position = findItem(currentItem);
        // kiểm tra nếu index > 0 thì ta nạp chồng phương thức "modifyGroceryItem"
        if (position >= 0) {
            // ! nạp chồng phương thức
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        // tạo biến nhận giá trị của hàm findItem
        int position = findItem(item);
        // kiểm tra nếu index > 0 thì ta nạp chồng phương thức "modifyGroceryItem"
        if (position >= 0) {
            // ! nạp chồng phương thức
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        // lấy một item tại vị trí được chọn

        groceryList.remove(position);

    }

    /**
     * 
     * @param searchItem nội dung nhập vào để tìm kiếm
     * @return sẽ trả về vị trí của item trong arraylist
     */
    // public String findItem(String searchItem) {
    // // boolean exists = groceryList.contains(searchItem);
    // int position = groceryList.indexOf(searchItem);// !=> trả về giá trị vị trí
    // của item trong arraylist
    // // kiểm tra nếu tìm thấy item thì trả về item đó

    // if (position >= 0) {

    // return groceryList.get(position);
    // }
    // // trả về "null" khi không tìm thấy item
    // return null;
    // }
    /**
     * 
     * @param searchItem
     * @return
     */
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);// !=> trả về giá trị vị trí của item trong arraylist
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
