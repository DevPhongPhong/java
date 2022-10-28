import java.util.Scanner;

public class Test {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a / gcd(a, b);
        b = b / gcd(a, b);
        System.out.println(a + "/" + b);
        sc.close();
    }
}
