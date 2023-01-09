package lab.Lab1va2;

public class Lab1 {
    int [] a;
    int n;
    /**
     * copy mảng
     * @param b
     */
    public Lab1(int[] b) {
        //lấy độ dài của mảng
       n = b.length;
        //tạo mảng 
        a = new int[n];
        //gán giá trị cho mảng
        for (int i = 0; i <n; i++) {
            a[i]=b[i];
        }
    }
    public void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
    public void sortArray() {
        int lengthArray = a.length;
        for (int i = 0; i <lengthArray-1; i++) {
            for (int j = 0; j < lengthArray-i-1; j++) {
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            display();
        }
    }
    public static void main(String[] args) {
        int[] array = {2 ,3 ,4 ,1 ,76, 2 ,3 ,4};
        Lab1 lab1 = new Lab1(array);
        lab1.sortArray();
        // lab1.display();
    }
}
