class MyStack<T extends Comparable<T>> {

    Node<T> head;
    private MyList<T> data;
    private int counter;

    public MyStack() {
        counter = 0;
        data = new MyList<>();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return counter;
    }

    public void push(T x) {
        data.insertHead(x);
        counter++;
    }

    public void pop() {
        data.removeNode(data.front().getData());
        counter--;
    }

    public T peek() {
        return data.front().getData();
    }

    public void showStackOfBinary() {
        data.showBinary();
    }

    public void showStack() {
        data.showList();
    }

    public void clearStack() {
        data.clear();
    }

    public void readFile(String filename) {
        data.readFromFile(filename, data, false);
    }
}