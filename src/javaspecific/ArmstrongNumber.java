package javaspecific;

import java.util.Scanner;

public class ArmstrongNumber {
    static boolean isArmstrong(int num){
        int temp, digits =0, last=0, sum=0;
        temp =num;
        while (temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = num;
        while (temp>0){
            last  = temp%10;
            sum += (Math.pow(last,digits));
            temp = temp/10;
        }

        if (num==sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)){
            System.out.println("Given number is armstrong");
        }else
            System.out.println("Given number is not armstrong");
    }
}


