package com.company;
import java.util.Scanner;

public class PalindromeCheck {
    static boolean isPalindrome(String x) {
        String str = String.valueOf(x);
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    /*static boolean palindromecheck(String num){
        int len = num.length();
        for (int i=0; i<len/2; i++) {
            if (num.charAt(i) != num.charAt(len - i - 1))
                return false;
        }
        return true;
    }*/

    /*Scanner sc = new Scanner(System.in);
    String st = String.valueOf(sc.nextInt());
    if (palindromecheck(st)==true)
        System.out.println("Yes");
    else
        System.out.println("No");
}*/
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = String.valueOf(sc.nextInt());
        if (isPalindrome(st)==true){
            System.out.println("True");
        }
        else
            System.out.println("False");

    }
}

