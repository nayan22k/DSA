package com.company;

import java.util.Scanner;

public class BathinWinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = X/(Y*2);
            System.out.println(Z);
        }
    }
}
