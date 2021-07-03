package javaspecific;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number to check if prime: ");
        int num = sc.nextInt();
        boolean flag=false;
        for (int i=2;i<=num/2;++i){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (num==1){
            System.out.println("1 is neither prime nor composite.");
        }else {
            if (!flag) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

    }
}
