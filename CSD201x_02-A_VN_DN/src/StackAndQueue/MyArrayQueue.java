package StackAndQueue;


public class MyArrayQueue implements IStackAndQueue {

    private int[] array;
    private int SIZE;

    private int headIndex;
    private int tailIndex;

    public MyArrayQueue(int size) {
        SIZE = size;
        array = new int[SIZE];
        headIndex = tailIndex= - 1;
    }

    public int count() {
        if (isEmpty()) {
            return 0;
        }
        return tailIndex - headIndex + 1;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if (!isFull()) {// chưa full
            if (isEmpty()) {
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            // gán giá trị đầu tiên cho value
            value = array[headIndex];
            headIndex++;// lùi về phái sau (phải)
            // kiểm tra xem head > tail không nếu lớn hơn là empty
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1;// list trở thành empty
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        // khi tail bằng với size của mảng
        return tailIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        // khi cả head và tail điều không có dữ liệu
        return (headIndex == -1) && (tailIndex == -1);
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

}
