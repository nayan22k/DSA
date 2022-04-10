package com.company;

public class ArrayCheckSorted {
    static boolean checkSorted(int[] arr){
        for (int i=1; i<arr.length; i++)
            if (arr[i]<arr[i-1]) {
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 12, 15};
        if (checkSorted(arr)==true) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
