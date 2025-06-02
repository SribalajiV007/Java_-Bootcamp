package interviewbased;

import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int count =0;

        if(n==0){
            count +=1;
        }else{
            if(n <= 0){
                n = -n;
            } 
            while(n!=0){
              n = n/10;
              count++;
        } 
    }

    System.out.println("Output: "+count+" digits");

        
    }
}
