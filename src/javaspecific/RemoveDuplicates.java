package javaspecific;

import java.util.Scanner;

public class RemoveDuplicates {
    public static int removingduplicate(int arr[],int n){
        if (n==0 || n==1)
            return n;

        int[] temp = new int[n];
        int j=0;
        for (int i=0;i<n-1;i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
            temp[j++] =arr[n-1];
            for (int i=0;i<j;i++)
                arr[i] = temp[i];
            return j;
            }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
    }
        n= removingduplicate(arr,n);
        System.out.println("After removing duplicates: ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        }
    }

