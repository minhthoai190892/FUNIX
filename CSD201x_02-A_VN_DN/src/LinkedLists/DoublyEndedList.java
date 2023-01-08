package LinkedLists;

public class DoublyEndedList {
    //khai bao bien 
    private Node head;
    private Node tail;

    public void addTail(int data) {
        // tao mot object
        Node newNode= new Node(data);
        // kiem tra xem linked list co rong khong
        if (this.head ==null) {
            // thi nut moi se tro thanh nut dau tien
            this.head = newNode;
            this.tail = newNode;
        }
        if (this.tail != null) {
            // nut moi tro thanh nut cuoi hien tai
            this.tail.setNextNode(newNode);
            this.tail = newNode;
            
        }
    }
    @Override
    public String toString() {
        String result = "{";
        //khai báo đối tượng hiện tại
        Node current  = this.head;
        while (current !=null) {
            result +=current.toString()+",";
            current =current.getNextNode();
        }
        result+="}";
        return result;
    }
}



/**
 * 
 * class DoublyLinkedList {    
    //A node class for doubly linked list
    class Node{  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    //Initially, heade and tail is set to null
    Node head, tail = null;  
   
    //add a node to the list  
    public void addNode(int item) {  
        //Create a new node  
        Node newNode = new Node(item);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
   
//print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  
}
class Main{
    public static void main(String[] args) {  
        //create a DoublyLinkedList object
        DoublyLinkedList dl_List = new DoublyLinkedList();  
        //Add nodes to the list  
        dl_List.addNode(10);  
        dl_List.addNode(20);  
        dl_List.addNode(30);  
        dl_List.addNode(40);  
        dl_List.addNode(50);  
   
        //print the nodes of DoublyLinkedList  
        dl_List.printNodes();  
    }  
}  
 * 
 */

/*
MAKH	Nvarchar(5),
TENKH	Nvarcha(30),
DIACHI	Nvarcha(300),
DT	Varchar(10),
EMAIL	Varchar(30)

MAVT	Nvarchar(5),
TENVT	Nvarchar(30),
DVT	Nvarchar(20),
GIAMUA	money,	 
SLTON 	 int

M
('HD'	'Nvarchar(10),'
'NGAY'	Datetime),	 ,
MAKH	Nvarchar(5),
TONGTG	money

M
('HD'	'Nvarchar(10),'
'MAVT'	Nvarchar)(5,),
SL	int,	 
GIABAN	money

('VT01','XI MANG','BAO',50000,5000),
('VT02','CAT','KHOI',45000,50000),
('VT03','GACH  ONG','VIEN',120,800000),
('VT04','GACH THE','VIEN',110,800000),
('VT05','DA LON','KHOI',25000,100000),
('VT06','DA NHO','KHOI',33000,100000),
('VT07','LAM GIO','CAI',15000,50000)

('KH01','NGUYEN THI BE','TAN BINH','08457895','bnt@yahoo.com'),
('KH02','LE HOANG NAM','BINH CHANH','09878987','namlehoang @abc.com.vn')

('KH03','TRAN THI CHIEU','TAN BINH','08457895')
('KH06' ,'TRAN HOANG KHAI' ,'TAN BINH' ,'08457897')

('KH04','MAI THI QUE ANH','BINH CHANH')

('KH05','LE VAN SANG','QUAN 10','sanglv@hcm.vnn.vn')

('HD001','2000-05-12','KH01',82000),
('HD002','2000-05-25','KH02',150),
('HD003','2000-05-25','KH01',55000),
('HD004','2000-05-25','KH04',270),
('HD005','2000-05-26','KH04',82000),
('HD006','2000-06-02','KH03',120),
('HD007','2000-06-22','KH04',125),
('HD008','2000-06-25','KH03',102000),
('HD009','2000-08-15','KH04',48000),
('HD010','2000-09-30','KH01',57000),
('HD011','2000-12-27','KH06',100000),
('HD012','2000-12-27','KH01',103150)


('HD001','VT01',5,52000),
('HD001','VT05',10,30000),
('HD002','VT03',10000,150),
('HD003','VT02',20,55000),
('HD004','VT03',50000,150),
('HD004','VT04',20000,120),
('HD005','VT05',10,30000),
('HD005','VT06',15,35000),
('HD005','VT07',20,17000),
('HD006','VT04',10000,120),
('HD007','VT04',20000,125),
('HD008','VT01',100,55000),
('HD008','VT02',20,47000),
('HD009','VT02',25,48000),
('HD010','VT01',25,57000),
('HD011','VT01',20,55000),
('HD011','VT02',20,45000),
('HD012','VT01',20,55000),
('HD012','VT02',10,48000),
('HD012','VT03',10000,150)
*/