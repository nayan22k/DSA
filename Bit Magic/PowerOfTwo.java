package com.company;
import java.util.*;

public class PowerOfTwo {
    static boolean checkPowerOfTwo(int n){
        if (n==0)
            return false;
        while (n != 1) {
            if (n%2!=0)
                return false;
            n=n/2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPowerOfTwo(n));
    }
}
