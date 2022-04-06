package com.company;

public class LCMofTwoNum {
    static int GCD(int a, int b){
        if (b==0){
            return a;
        }
        return GCD(b, a%b);
    }
    // LCM = Product of two numbers/GCD
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        System.out.println("The LCM of a and b is " + a*b/GCD(a,b));
    }
}
