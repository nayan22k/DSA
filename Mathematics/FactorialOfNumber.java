package com.company;

public class FactorialOfNumber {
    static int fact(int n) {
        if (n==0) {
            return 1;
        }
        return n* fact(n-1);
    }
    /*int res = 1, i;
        for (i = 2; i <= n; i++)      Using for loop
    res *= i;
        return res;*/

    public static void main(String[] args) {
        int num= 5;
        System.out.println(fact(5));

    }
}

