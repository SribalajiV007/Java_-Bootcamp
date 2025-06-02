// 90 to 100 → A
// 80 to 89 → B
// 70 to 79 → C
// 60 to 69 → D
// Below 60 → F
import java.util.Scanner;

public class grade {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your mark: ");
        int mark = s.nextInt();

        if(mark>89 && mark<=100)
           System.out.println("Grade A");
        else if(mark>79 && mark<=89)
           System.out.println("Grade B");
        else if(mark>69 && mark<=79)
           System.out.println("Grade C");
        else if(mark>59 && mark<=68)
           System.out.println("Grade D");
        else 
        System.out.println("Fail");
    }
}
