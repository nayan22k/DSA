package com.company;

public class AllDivisorsOfaNum {
    static void Divisor(int n) {
        /*for (int i = 1; i <= n; i++) {
            if (n % i == 0)                 // Naive Solution
                System.out.print(i + "  ");
        }*/

        int i;
        for (i=1; i*i<n; i++)
            if (n%i==0)
                System.out.print(i + " ");
        for (; i>=1; i--)
            if (n%i==0)
                System.out.print(n/i + " ");
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("The divisors of the given number are:");
        Divisor(n);
    }
}
