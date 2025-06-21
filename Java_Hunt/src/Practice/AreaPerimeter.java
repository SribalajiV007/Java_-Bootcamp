package Practice;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter breadh: ");
        double br = s.nextDouble();

        System.out.println("Enter Length: ");
        double len = s.nextDouble();

        System.out.println("Area of the rectangle is: "+(len*br));
        System.out.println("Perimater of rectangle is: "+((len+br)*2));
    }
}
