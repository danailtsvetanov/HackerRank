package code.of.days;

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble();
        int T = sc.nextInt();
        int X = sc.nextInt();

        double tip = (T * M) / 100;
        double tax = (X * M) / 100;
        double finalPrice = M + tip + tax;
        int total = (int) Math.round(finalPrice);

        System.out.println("The final price of the meal is $" + total + ".");
        sc.close();

    }

}