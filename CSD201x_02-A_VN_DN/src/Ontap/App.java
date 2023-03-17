package Ontap;

public class App {
    public static void main(String[] args) {
        int[] array = {1,100,5,4,9,6,8,7};
        sort(array, 0, array.length-1);
        show(array);
    }
    public static void merge(int[] array,int l,int m,int r) {
        int n1 = m-l+1;
        int n2 = r-m;
        int[]L = new int[n1];
        int[]R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i]=array[l+i];
        }
        for (int i = 0; i < n2; ++i) {
            R[i] = array[m+1+i];
        }
        int i=0,j=0;
        int k=l;
        while (i<n1&&j<n2) {
            if (L[i]<R[j]) {
                array[k]=L[i];
                i++;
            }else{
                array[k]=R[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            array[k]=L[i];
            i++;
            k++;

        }
        while (j<n2) {
            array[k]=R[j];
            j++;
            k++;
        }

    }
    public static void sort(int[] array,int l,int r) {
        if (l<r) {
            int mid = l+(r-l)/2;
            sort(array, l, mid);
            sort(array, mid+1, r);
           merge(array, l, mid, r);
        }
    }
    public  static void show(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
   
}
