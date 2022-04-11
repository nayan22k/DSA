package com.company;

public class RemoveDuplicatesFromArray {
    static int remDups(int[] arr){
        int res=1;
        for (int i=1; i<arr.length; i++){
            if (arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }




//    static int remDups(int[] arr){
//        int[] temp = new int[arr.length];
//        temp[0] = arr[0];
//        int res = 1;
//        for (int i=1; i< arr.length; i++){
//            if (temp[res-1]!=arr[i]){
//                temp[res]=arr[i];
//                res++;
//            }
//        }
//        for (int i=0; i<res; i++)
//            arr[i]=temp[i];
//        return res;
//}

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,20,30,30,30,30};
        int n=remDups(arr);
        for (int i=0;i< n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(remDups(arr));
    }
}
