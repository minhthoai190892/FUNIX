class MyQueue<T extends Comparable<T>> {

    /**
     * 
     * Head node contains front node in the queue
     * 
     */

    /**
     * 
     * Tail node contains last node in the queue
     * 
     */

    Node<T> tail;

    Node<T> head;
    private MyList<T> data;
    private int counter;

    /**
     * khởi tạo đối tượng
     */
    public MyQueue() {
        counter = 0;
        data = new MyList<>();
    }

    /** kiểm tra danh sách có rỗng không
     * @return
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return counter;
    }

    /** hàm thêm vào cuối danh sách
     * @param x
     */
    public void push(T x) {
        data.insertTail(x);
        counter++;
    }

    public void pop() {
        data.removeNode(data.front().getData());
        counter--;
    }

    public T peek() {
        return data.front().getData();
    }



    /**
     * @param filename
     */
    public void readFile(String filename) {
        data.readFromFile(filename, data, true);
    }

    public void clearQueue() {
        data.clear();
    }

    public void showQueue() {
        data.showList();
    }

}