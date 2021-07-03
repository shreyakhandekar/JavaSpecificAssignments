package javaspecific;

import java.util.Scanner;

public class DistinctElements {
    public static void getDistinctEle(int[] arr){
        for (int i=0;i< arr.length;i++){
            boolean isDistinct = false;
            for (int j=0;j<i;j++){
                if (arr[i]==arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct){
                System.out.print(arr[i]+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Distinct elements are: ");
        DistinctElements.getDistinctEle(arr);
    }

}
