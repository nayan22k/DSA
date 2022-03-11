package com.company;


public class TrailingZerosinFactorial {
    //Naive Method
    /*static int factorial(int n){
        if (n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int a= factorial(5);
        int result=0;
        while(a%10==0){
            result++;
            a=a/10;
        }
        System.out.println(result);
    }*/

    // Iterative Solution
    static int trailingZeros(int n) {
        int res = 0;
        for (int i = 5; i <=  5; i=i * 5)
            res = res + n/i;
            return res;
    }

    public static void main(String[] args) {
        int a = trailingZeros(5);
        System.out.println(a);
    }
}
