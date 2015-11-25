package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysDS {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[Integer.parseInt(buffer.readLine())];
        String[] temp = buffer.readLine().split(" ");

        for (int i = temp.length - 1, j = 0; i >= 0; i--, j++) {
            array[j] = Integer.parseInt(temp[i]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < (array.length - 1)) {
                System.out.print(" ");
            }
        }

    }

}
