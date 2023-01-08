package Algorithms.SearchMatrix;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int[][] a = new int[n][n];
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length; j++) {
        //         a[i][j]=scanner.nextInt();
        //     }
        // }
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int maxtrix[][] ={
        //   j  j  j  j
        //   ∀  ∀  ∀  ∀
            {10,20,30,40},//>i
            {15,25,35,45},//>i
            {27,29,37,48},//>i
            {32,33,39,51} //>i
        };
        int length = maxtrix.length;
        searcht(maxtrix, length, 48);
    }
    /**
     * 
     * @param maxtrix mảng 2 chiều
     * @param n số lượng / phạm vi tìm kiếm
     * @param x số tiềm kiếm
     */
    public static void searcht( int[][] maxtrix,int n,int x ) {
        int i=0;
        int j=n-1;
        while (i<n && j>=0) {
            if (maxtrix[i][j]==x) {
                System.out.println("x found at - "+i+", "+j);
                return;
            }
            if (maxtrix[i][j]>x) {
              j--;  
            }else{
                i++;
            }
        }
        System.out.println("Not found");
    }
}

