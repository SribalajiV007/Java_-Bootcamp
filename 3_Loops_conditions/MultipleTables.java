import java.util.Scanner;

public class MultipleTables {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the max number for multiplication tables: ");
        int max = s.nextInt();

        for (int num = 1; num <= max; num++) {        // outer loop for numbers 1 to max
            System.out.println("Multiplication table for " + num + ":");
            
            for (int i = 1; i <= 12; i++) {          // inner loop for multiplier 1 to 12
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println();  // blank line between tables for readability
        }
    }
}
// import java.util.Scanner;

// public class multiplytable {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = s.nextInt();

//         for(int i = 1; i <= 12; i++) {
//             System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }
// }
