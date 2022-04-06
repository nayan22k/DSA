package com.company;

public class RecursionRopeCuttingProblem {
    static int maxPieces(int n, int a, int b , int c){
          if (n==0)
              return 0;
          if (n<0)
              return -1;
          int res = Math.max((maxPieces(n-a,a,b,c)),
                  Math.max(maxPieces(n-b,a,b,c),
                  maxPieces(n-c,a,b,c)));
          if (res==-1)
              return -1;
          return res+1;
    }

    public static void main(String[] args) {
        int n = 23;
        int a = 11;
        int b = 9;
        int c = 12;
        System.out.println(maxPieces(n,a,b,c));
    }
}
