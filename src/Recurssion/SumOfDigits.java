package Recurssion;

public class SumOfDigits {

    public static void main(String[] args) {
        int sum = SumOfDigits.digitsSum(111);
        System.out.println(sum);
    }

    public static int digitsSum(int n){
        if(n == 0 || n<0){
            return 0;
        }
        return n%10 + digitsSum(n/10);
    }
}
