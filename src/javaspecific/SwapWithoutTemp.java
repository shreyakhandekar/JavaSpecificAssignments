package javaspecific;

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("\nBefore Swapping numbers are :\nNUMBER 1: "+num1+"\tNUMBER 2: "+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("\nAfter Swapping numbers are :\nNUMBER 1: "+num1+"\tNUMBER 2: "+num2);
    }
}
