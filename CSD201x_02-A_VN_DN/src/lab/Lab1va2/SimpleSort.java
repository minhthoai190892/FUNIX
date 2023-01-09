package lab.Lab1va2;

public class SimpleSort {
    int[] a;
    int n;

    public SimpleSort() {
    }

    public SimpleSort(int[] b) {
        int i;
        n = b.length;
        a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = b[i];
        }
    }

    void display() {
        int i;
        for (i = 0; i < n; i++)
            System.out.print("  " + a[i]);
        System.out.println();
    }

    public void sortArray() {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]) {
                    
                    // swap(i, j);
                    int temp = a[j];
                    a[j] =a[j+1];
                    a[j+1]=temp;
                }
            }
            display();
        }
    }

    void swap(int i, int k) // Hàm hoán vị
    {
        int x;
        x = a[i];
        a[i] = a[k];
        a[k] = x;
    }

    public static void main(String[] args) {
        int[] b = { 2, 4, 1, 8, 3 };
        SimpleSort simpleSort = new SimpleSort(b);
        simpleSort.sortArray();
        simpleSort.display();

    }
}
