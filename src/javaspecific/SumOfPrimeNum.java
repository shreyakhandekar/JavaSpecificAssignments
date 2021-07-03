package javaspecific;

public class SumOfPrimeNum {
    private static boolean isPrimeNum(int num){
        for (int i=2;i<num/2;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num=2;
        long sum =0;
        int count = 0;
        while (count<1000){
            if (isPrimeNum(num)){
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of first 1000 prime numbers: "+sum);
    }
}
