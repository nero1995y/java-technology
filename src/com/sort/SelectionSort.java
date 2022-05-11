package com.sort;

public class SelectionSort {

    public static void  main(String[] args) {
        int[] arr = {4,3,5,1};
        selectSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void selectSort(int[] a ){
        selectSort(a, a.length);
    }

    public static void selectSort(int[] a, int size){

        for (int i = 0; i < size -1 ; i++) {
            int minIndex = i;

            for (int j = i+ 1; j < size; j++) {
                if (a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            swap(a, minIndex, i);
        }
    }

    private static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
