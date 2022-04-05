package com.company;

public class RecursionPrint1toN {
    static void PrintN(int n){
        if (n==0)
            return;
        PrintN(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        PrintN(n);
    }
}
