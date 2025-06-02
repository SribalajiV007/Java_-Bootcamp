import java.util.Scanner;


public class evenorodd{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if(num%2 == 0){
            System.out.println(num+" is Even number.");
        }else{
            System.out.println(num+" is Even number.");
        }
    }
}




















// public class evenorodd{
//     public static void main(String[]args){
//     Scanner s = new Scanner(System.in);
 
//     System.out.print("Enter a number: ");
//     int n = s.nextInt();

//     if(n%2 == 0){
//         System.out.println("Its an even number");
//     }else{
//         System.out.println("it's an odd number");
//     }
//    }
// }