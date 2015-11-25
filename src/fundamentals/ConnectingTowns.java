package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConnectingTowns {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(buffer.readLine()); t > 0; t--) {
            int n = Integer.parseInt(buffer.readLine()) - 1;
            String[] temp = buffer.readLine().split(" ");
            int r = 1;
            while (n-- > 0) {
                r = (r * Integer.parseInt(temp[n])) % 1234567;
            }
            System.out.println(r);
        }

    }

}
