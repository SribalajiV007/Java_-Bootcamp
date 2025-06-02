import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String  password = "Balaji007";
        String pass;
        int attempts =0;

        do {
            System.out.print("Enter password: ");
            pass = s.nextLine();
            attempts++;

            if(attempts==3 && !password.equals(pass)){
                System.out.println("Too many attempts..Access Denied!");
                return;
            }
        } while (!password.equals(pass));

        System.out.println("Access Granted!");
    }
}
