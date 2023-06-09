package Recurssion;

// calculate power of number using recurssion

public class PowerOfNumber {

    public static void main(String[] args) {
        int result = PowerOfNumber.calculate(2,3);
        System.out.println(result);
    }

    public static int calculate(int base, int power){
        if(power<0){
            return -1;
        }
        if(power ==0 || power ==1){
            return base;
        }
        return base * calculate(base, power-1);
    }
}
