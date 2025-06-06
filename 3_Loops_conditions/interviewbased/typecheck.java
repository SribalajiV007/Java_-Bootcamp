package interviewbased;

import java.util.Scanner;

public class typecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }


    }
}
