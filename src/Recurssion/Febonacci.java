package Recurssion;

public class Febonacci {

    public static int febo(int n){
        if(n<0){
            return -1;
        }
        if(n ==0 || n ==1){
            return n;
        }
        return febo(n-1) + febo(n-2)  ;
    }

    public static void main(String[] args) {
        int a =  Febonacci.febo(6 );
        System.out.println(a);
    }
}
