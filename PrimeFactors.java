package com.company;

public class PrimeFactors {
    static int primefactors(int n){
        if (n<= 1)
            return 0;
        for (int i = 2; i*i <= n; i++){
                while (n%i==0){
                    System.out.println(i);
                    n= n/i;
                }
            }
        if (n>1)
            System.out.println(n);
        return 0;
    }


    public static void main(String[] args) {
        int n = 450;
        System.out.println(primefactors(n));
    }
}
