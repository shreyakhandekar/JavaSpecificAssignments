package javaspecific;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for (int j=1;j<n;j++)
        {
        int key = arr[j];
        int i=j-1;
        while((i>-1) && (arr[i]>key)){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nEntered array: ");
        for (int i:arr){
            System.out.print(i+ " ");
        }
        insertionSort(arr);
        System.out.println("\nAfter sorting: ");
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
