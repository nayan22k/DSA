package com.company;

public class ReverseArray {
    static void reverse(int[] arr) {
        int high = arr.length - 1;
        int temp = 0;
        for (int low = 0; low < high; low++) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
        }
        for (int k = 0; k < temp; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{10,5,6,7,30};
        reverse(array);
    }
}
