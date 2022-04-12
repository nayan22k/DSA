package com.company;

public class LeftRotateArrayByOne {
    static void leftRotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for (int i=1; i<arr.length; i++)
            arr[i-1]=arr[i];
        arr[n-1]=temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int n = arr.length;
        leftRotate(arr);
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
