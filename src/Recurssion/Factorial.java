package Recurssion;

public class Factorial {
    public static int fact(int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return 4;
        }
        return n* fact(n-1);
    }
    public static void main(String[] args) {
        int rec = Factorial.fact(4);
        System.out.println(rec);
    }
}
