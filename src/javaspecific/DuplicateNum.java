package javaspecific;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateNum {
    public int duplicateNumber(List<Integer> num){
        int highNum = num.size()-1;
        int total = getSum(num);
        int duplicate = total - (highNum*(highNum+1)/2);
        return duplicate;
    }
    public int getSum(List<Integer> num){
        int sum = 0;
        for (int n: num){
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();
        System.out.println("Enter the Range of list: ");
        int N = sc.nextInt();
        for (int i=1;i<N;i++){
            num.add(i);
        }
        System.out.println("Add duplicate number in the list: ");
        int dnum  = sc.nextInt();
        num.add(dnum);
        DuplicateNum dn = new DuplicateNum();
        System.out.println("Duplicate Number is: "+dn.duplicateNumber(num));
    }
}
