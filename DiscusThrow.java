package com.company;
import java.util.Scanner;

public class DiscusThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while (T-->0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A>=B && A>=C){
                System.out.println(A);
            }
            else if (B>=A && B>=C){
                System.out.println(B);
            }
            else {
                System.out.println(C);
            }
        }
    }
}
