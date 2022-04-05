package com.company;

public class RecursionPrintNto1 {
    static void Nto1(int n){
        if (n==0)
            return;
        System.out.print(n + " ");
        Nto1(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        Nto1(n);

    }
}
