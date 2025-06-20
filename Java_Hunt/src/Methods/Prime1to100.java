package Methods;

public class Prime1to100 {
    public static void main(String[] args) {
        System.out.println("Prime number from 1 to 100: ");

        for(int i=1;i<=100;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static  boolean isPrime(int num){
         if(num<=1){
             return false;
         }

         for(int i=2;i*i <= num;i++){
             if(num % i == 0){
                 return false;
             }
         }
         return true;
    }
}
