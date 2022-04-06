package com.company;

public class RecursionPalindromeCheck {
    static boolean palindrome(String str, int start, int end){
        if(str.length()==1 || str.length()==0)
                return false;
        if (start>=end)
            return true;
        return (str.charAt(start)==str.charAt(end))&& palindrome(str, start +1,end-1);
    }

    public static void main(String[] args) {
        String str = "nayan";
        if (palindrome(str,0,str.length()-1))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
