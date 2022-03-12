package com.company;

public class GCD {
    static int GCD(int a, int b){
        if (b==0){
            return a;
        }
        return GCD(b, a%b);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println("GCD of a and b is " + GCD(a,b));
    }
}
