package code.of.days;

import java.util.Scanner;

public class Day5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if ((T < 0) && (T > 500)) {
            System.out.println("Enter T: 0 <= T <= 500");
            T = sc.nextInt();
        }
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            if ((a < 0) && (a > 50)) {
                System.out.println("Enter a: 0 <= b <= 50");
                a = sc.nextInt();
            }
            int b = sc.nextInt();
            if ((b < 0) && (b > 50)) {
                System.out.println("Enter b: 0 <= b <= 50");
                b = sc.nextInt();
            }
            int N = sc.nextInt();
            if ((N < 1) && (N > 15)) {
                System.out.println("Enter N: 1 <= N <= 15");
                N = sc.nextInt();
            }
            printResults(a, b, N);
        }
        sc.close();

    }

    private static void printResults(int a, int b, int n) {
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp = 0;
            for (int j = 0; j <= i; j++) {
                tmp = tmp + (int) (Math.pow(2.0, j) * b);

            }
            tmp += a;
            System.out.print(tmp);
            if (i < n - 1) {
                System.out.print(" ");
            }

        }
        System.out.println();
    }

}
