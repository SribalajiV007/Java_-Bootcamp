import java.util.Scanner;

public class Fibanocci{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

         System.out.println("Enter a number: ");
         int n = s.nextInt();

         int first =0, second=1;

         System.out.println("Fibanocci series of "+n+" is ");
         for(int i=0;i<=n;i++){
              System.out.print(first+" ");
              int next = first + second;
              first = second;
              second = next;
         }

    }
}






















// import java.util.Scanner;

// public class  Fibanocci{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n = s.nextInt();

//         int first = 0, second =1;


//         System.out.println("The fibanocci of "+n+" numbers is: ");
//         for(int i =1;i<=n;i++){
//             System.out.print(first+" ");
//             int next = first + second;
//             first = second;
//             second = next;
//         }
//     }
// }

