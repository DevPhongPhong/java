import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] s = sc.nextLine().split(" ");
            long t = Long.parseLong(s[0]);
            long m = Long.parseLong(s[1]);

            long gcd = gcd(t, m);
            System.out.println((t / gcd) + "/" + (m / gcd));
        } catch (Exception e) {
            System.out.println("");
        }

    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long t = a;
            a = b;
            b = t % b;
        }
        return a;
    }
}