package javaspecific;

import java.util.Scanner;

public class StringToNum {
    public static int convertStrToNum(String str){
        char character[] = str.toCharArray();
        int sum = 0;
        int zeroAscii =(int)'0';
        for (char ch:character){
            int tempAscii = (int)ch;
            sum = (sum*10)+(tempAscii-zeroAscii);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter String number: ");
        String str = sc.nextLine();
        System.out.println("Converted String to Number '"+str+"': "+convertStrToNum(str));

    }
}
