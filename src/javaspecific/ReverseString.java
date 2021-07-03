package javaspecific;

import java.util.Scanner;

public class ReverseString {
    public String reverse(String str){
        if(str.isEmpty()){
            System.out.println("String is empty");
            return str;
        }else
        {
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        ReverseString r = new ReverseString();
        System.out.println("Reverse String : ");
        System.out.println(r.reverse(str));
    }
}
