package com.company;

public class RecursionJosephusProblem {
    static int jos(int n, int k){
        if (n==1)
            return 0;
        else
            return (jos(n-1,k)+k)%n;
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        System.out.println(jos(n,k));
    }
}
