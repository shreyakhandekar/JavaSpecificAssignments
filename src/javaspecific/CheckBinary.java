package javaspecific;

import java.util.Scanner;

public class CheckBinary {
    public static boolean isBinary(int num){
        if (num==0 || num ==1 || num< 0){
            return false;
        }
        while (num !=0){
            if (num%10 >1){
                return false;
            }
            num = num/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        int binary = sc.nextInt();
        if (!isBinary(binary))
        System.out.println("Given number is not binary");
        else
            System.out.println("Given number is binary");
    }
}
