package com.company;

public class CheckKthBit {
    //To check if the Kth bit of a given number is set or not.
    static void CheckSet(int n, int k){
        if (( n & (1 << (k-1)))!=0) {
            System.out.println("Yes");
        }else
        System.out.println("No");

    }
    public static void main(String[] args) {
        int n=5;
        int k=5;
        CheckSet(n,k);
    }
}
