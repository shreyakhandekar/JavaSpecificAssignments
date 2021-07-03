package javaspecific;

import java.util.Scanner;

public class MiddleIndex {
    public static int findMiddleIndex(int[] num) throws Exception{
        int endIndex = num.length-1;
        int startIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;
        while(true){
            if (sumLeft > sumRight){
                sumRight += num[endIndex--];
            }else {
                sumLeft += num[startIndex++];
            }
            if (startIndex>endIndex){
                if (sumLeft==sumRight){
                    break;
                }else {
                    throw new Exception("Please pass proper array to match the requirement");
                }
            }
        }
        return endIndex;
    }

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("Enter array elements: ");
        for (i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        try {
            System.out.println("Starting from index 0, adding numbers till index " + findMiddleIndex(arr)+" adding rest of numbers can be equal ");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
