
// Java Program to find LCM of two large numbers
import java.math.*;
import java.lang.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n > 0) {
            n--;
            String[] s = sc.nextLine().split(" ");
            BigInteger a = new BigInteger(s[0]);
            BigInteger b = new BigInteger(s[1]);
            if (a.compareTo(b) == -1) {
                BigInteger temp = a;
                a = b;
                b = temp;
            }
            System.out.println(a.divideAndRemainder(b)[1].equals(BigInteger.ZERO) ? "YES" : "NO");
        }
        sc.close();
    }
}