package com.company;

public class CountSetBits {
    static int CountSet(int n){
        //Naive Sol
        int res = 0;            // Time complexity-->theta(total bits in n)
        while(n>0){
            //if (n%2!=0)
            n=(n&(n-1));        //Time complexity-->theta(set bit count)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(CountSet(n));
    }
}
