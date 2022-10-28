import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            // String s1 = sc.next();
            // String s2 = s1.substring((int) s1.length() / 2 + 1);
            // s1 = s1.substring(0, (int) s1.length() / 2 + 1);

            // System.out.print(s1+" "+s2);
            String s = sc.next();
            while (s.length() != 1) {
                BigInteger s1 = new BigInteger(s.substring(0, (int) s.length() / 2));
                BigInteger s2 = new BigInteger(s.substring((int) s.length() / 2));
                s = s1.add(s2).toString();
                System.out.println(s);
            }
            sc.close();
        } catch (FileNotFoundException e) {

        }

    }
}
