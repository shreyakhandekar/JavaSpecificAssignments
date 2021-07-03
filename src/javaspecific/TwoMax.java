package javaspecific;

import java.util.Scanner;

public class TwoMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to enter in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max1, max2, temp;
        max1 = arr[0];
        max2 = arr[1];

        if (max1<max2){
            temp = max1;
            max1 = max2;
            max2 = temp;
        }
        for (int i=2;i< arr.length;i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i]>max2 && arr[i] != max1){
                max2  = arr[i];
            }
        }
            System.out.println("First Maximum number : "+max1+"\nSecond Maximum number : "+ max2);
    }
}
