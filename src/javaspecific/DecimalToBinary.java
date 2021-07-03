package javaspecific;

import java.util.Scanner;

public class DecimalToBinary {
    public static void convertDecimal(int decimal){
        int[] binary = new int[40];
        int index = 0;
        while (decimal>0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for (int i=index-1;i>=0;i--){
            System.out.print(binary[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Decimal to binary number: ");
        convertDecimal(decimal);
    }
}
