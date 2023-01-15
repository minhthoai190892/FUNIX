package StackAndQueue;

public class MyArrayStack implements IStackAndQueue {

    // khai báo Arrray
    private int[] array;
    private int SIZE;
    private int topIndex;

    // hàm khởi tạo

    @Override
    public boolean push(int value) {

        // kiểm tra mảng có rỗng không
        if (!isFull()) {
            topIndex++;
            // gán giá trị vào mảng khi topIndex tăng lên 1 đơn vị
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    public MyArrayStack(int sIZE) {

        SIZE = sIZE;
        array = new int[SIZE];

        topIndex = -1;// -> Stack đang rỗng
        // push thì topIndex + 1
        // pop thì topIndex - 1

    }

    @Override
    public int pop() {
        if (!isEmpty()) {// ->không rỗng
            int value = array[topIndex];// lấy ra phần tử đầu tiên
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        // full khi topIndex trỏ vào vị trí cuối cùng
        return topIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {

        return topIndex < 0;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

}
