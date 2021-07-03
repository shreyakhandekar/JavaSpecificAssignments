package javaspecific;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.println("Enter number of elements: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci series: ");
        System.out.print(num1+" "+num2);
        for (int i = 2;i<num;++i){
            num3 = num1+num2;
            System.out.print(" "+num3+" ");
            num1 = num2;
            num2 = num3;
        }
    }
}

