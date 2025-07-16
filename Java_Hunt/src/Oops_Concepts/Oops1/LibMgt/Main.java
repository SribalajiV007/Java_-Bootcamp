package Oops_Concepts.Oops1.LibMgt;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true){
            System.out.println("\n1. Add Book\n2. List Books\n3. Search Book by Title\n4. Delete Book\n5. Update Availability\n6. Exit");
            System.out.print("Choose an Option: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch){
                case 1:
            }
        }

    }
}
