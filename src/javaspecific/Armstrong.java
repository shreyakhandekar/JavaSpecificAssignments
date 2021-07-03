package javaspecific;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int temp,flag = 0;
        int sum=0, rem=0;
        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
            if (sum == num) {
                flag = 1;

            } else {
                flag = 0;
            }
        }
        if (flag==1)
            System.out.println("Given number is Armstrong");
        else
            System.out.println("Given number is not armstrong");
        }
    }
