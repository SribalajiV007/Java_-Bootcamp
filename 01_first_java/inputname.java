import java.util.Scanner;

public class inputname {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = s.nextLine();

        System.out.println("Hello "+name+" very good evening!");
    }
}
