import java.util.Scanner;

public class Test {
    public static String Check(int n) {
        if (n == 1)
            return "NO";
        if (n == 2)
            return "YES";
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(Check(sc.nextInt()));
        }
    }
}