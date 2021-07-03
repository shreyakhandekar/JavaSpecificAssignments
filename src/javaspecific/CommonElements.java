package javaspecific;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array 1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the array 1: ");
        for (int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter number of elements of array 2: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the array 2: ");
        for (int j=0;j< arr2.length;j++){
            arr2[j] = sc.nextInt();
        }
        System.out.println("Common elements: ");
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
