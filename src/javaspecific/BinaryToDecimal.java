package javaspecific;

import java.util.Scanner;

public class BinaryToDecimal {
    static int bianryTodecimal(int num){
       // int n = num;
        int decimal =0;
        int base = 1;

        int temp =num;
        while (temp>0){
            int digit = temp % 10;
            temp = temp/10;
            decimal += digit*base;
            base = base *2;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        int num = sc.nextInt();
        System.out.println("Binary to decimal conversion: "+bianryTodecimal(num));

    }
}
