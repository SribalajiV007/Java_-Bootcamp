package interviewbased;
import java.util.Scanner;

public class reversenum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int n = s.nextInt();

        int reverse =0;
        while(n!=0){
            int last = n%10;
            reverse = reverse * 10 + last;
            n = n/10;
        }
        System.out.println("The reverse of give number is: "+reverse);
    }
}








// public class reversenum {
//     public static void main(String[] args) {
//         Scanner  s = new Scanner(System.in);

//         System.out.print("Enter a number to reverse: ");
//         int num = s.nextInt();
//         int reverse =0;

//         while(num!=0){
//             int last = num %10;
//             reverse =reverse * 10+ last;
//             num = num/10;
//         }
//         System.out.println("The reverse of give number is: "+reverse);
//     }
// }
//input = 123
// 3 * 10= 0 + 3 =3
 // 3*10 =30+2
 // 32*10 =320+1 = 321
