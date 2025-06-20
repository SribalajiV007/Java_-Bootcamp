package Methods;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        if (isPrime(number)){
            System.out.println(number+" is a Prime number");
        }else{
            System.out.println(number+" is not a Prime number");
        }
    }

     static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        for(int i=2; i*i <= num; i++){
            if(num % i==0){
                return false;
            }
        }
         return true;
    }
}
