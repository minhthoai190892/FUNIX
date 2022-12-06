package Algorithms.ComparetheTriplets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (/*
                 * Alice and Bob each created one problem for HackerRank. A reviewer rates the
                 * two challenges, awarding points on a scale from 1 to 100 for three
                 * categories: problem clarity, originality, and difficulty.
                 * 
                 * The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and
                 * the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).
                 * 
                 * The task is to find their comparison points by comparing a[0] with b[0], a[1]
                 * with b[1], and a[2] with b[2].
                 * 
                 * If a[i] > b[i], then Alice is awarded 1 point.
                 * If a[i] < b[i], then Bob is awarded 1 point.
                 * If a[i] = b[i], then neither person receives a point.
                 * Comparison points is the total points a person earned.
                 * 
                 * Given a and b, determine their respective comparison points.
                 */
        Scanner scanner = new Scanner(System.in)) {
            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.print("Enter list A with element "+(i+1)+": ");
                int aItem = scanner.nextInt();
                a.add(aItem);
            }
            
            List<Integer> b = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.print("Enter list B with element "+(i+1)+": ");
                int bItem = scanner.nextInt();
                b.add(bItem);
            }
            System.out.println(compareTriplets(a, b).toString());
        }
      
    }
    /**
     * Hàm so sánh 2 mảng
     * @param a list a
     * @param b list b
     * @return list kết quả
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        //tạo biến đếm
        int alice =0;
        int bob =0,i;
        //tạo biến chứa kết quả 
        List<Integer> ans = new ArrayList<>();
        //sử dụng vòng lặp để duyệt qua list a
        for(i=0; i<a.size();i++)
        {
            //kiểm tra phần tử của list a và list b
            if(a.get(i)>b.get(i))
            {
                alice++;
            }
            else if(a.get(i)<b.get(i))
            {
                bob++;
            }
        }
        //sau khi kiểm tra ta thêm vào list kết quả
        ans.add(alice);
        ans.add(bob);
        //trả về list kết quả
        return ans;
        
    }
}
