package Loops;

public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        int fact = 1;

        for(int i =1;i <= n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
/*
*  n= 5;
*  fact =1
*   i =2
*   fact = 24 * 5 = 120;
*
* */
