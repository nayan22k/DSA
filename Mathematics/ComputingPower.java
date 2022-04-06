package com.company;

public class ComputingPower {
    static int power(int x, int n){
        int res=1;
        for (int i=0; i<n;i++){
            res=res*x;
        }
        return res;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(power(x,n));

    }
}
