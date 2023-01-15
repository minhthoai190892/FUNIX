package StackAndQueue;

public interface IStackAndQueue {
    //thêm phần tử 
    public boolean push(int value);
    //lấy phần tử
    public int pop() ;
    //kiểm tra mảng có dầy không
    public boolean isFull() ;
    //kiểm tra mảng có rỗng không
    public boolean isEmpty() ;
    public void show();

}
