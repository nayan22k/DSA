package com.company;

public class MoveZerostoEnd {
    static void moveZeros(int[] arr){
        int count = 0;
        int n = arr.length;
        for (int i=0; i<n; i++){
            if (arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count<n)
            arr[count++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,5,0,10,0,20};
        int n= arr.length;
        moveZeros(arr);
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
