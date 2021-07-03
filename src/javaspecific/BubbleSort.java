package javaspecific;

import java.util.Scanner;

public class BubbleSort {
    static void bubblesort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i=0;i<=n;i++){
            for (int j=1;j<=(n-1);j++){
                if (arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        bubblesort(arr);
        System.out.println("\nSorted array: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
