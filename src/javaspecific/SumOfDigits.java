package javaspecific;

import java.util.Scanner;

public class SumOfDigits {
    static int sumofdigit(int num){
        if (num==0)
            return 0;
        return (num%10 + sumofdigit(num/10));
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = sumofdigit(num);
        System.out.println("Sum of digits of given number: "+result);
    }
}
