
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        String m = sc.next().toLowerCase();
        if (d > 0 && r > 0) {
            m = (char) (m.charAt(0) - 32) + m.substring(1);
            System.out.print((2 * (d + r)) + " " + (d * r) + " " + m);
        } else {
            System.out.println("INVALID");
        }
    }
}
