package javaspecific;

import java.util.Scanner;

public class PerfectNumber {
    public static void checkPerfect(int num){
        int sum=0;
        for (int i=1;i<num;i++){
            try{
                if (num%i==0){
                    sum = sum+i;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        if (sum==num){
            System.out.println("Entered number is perfect.");
        }else {
            System.out.println("Entered number is not perfect. ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check perfect or not: ");
        int num = sc.nextInt();
        checkPerfect(num);
    }
}
