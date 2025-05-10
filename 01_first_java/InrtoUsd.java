import java.util.Scanner;

class InrtoUsd{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double exchangeRate = 0.012;

        System.out.println("Enter amount in ₹(INR): ");
        double inrAmount = s.nextDouble();

        double usdAmount = exchangeRate * inrAmount;

        System.out.println("₹"+inrAmount+" =$"+usdAmount+"USD");
    }
}