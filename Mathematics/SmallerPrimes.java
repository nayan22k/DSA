package com.company;

public class SmallerPrimes {
    static boolean CheckPrime(int n) {
        if (n == 1 || n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 2; i * i < n; i++)     // Naive method--> i<n Iterative Method --> i*i < n
            if (n % i == 0)
                return false;
        return true;
    }
    static void printPrimes(int n){
        for (int i=2; i<=n; i++)
            if (CheckPrime(i))
                System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println("Prime numbers smaller than n are: ");
        printPrimes(n);
    }
}
