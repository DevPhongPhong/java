import java.util.Scanner;

public class Test {
    private static long CONST = 1000000007;

    private static long Pow(long a, long b) {
        a = a % CONST;
        long c = 1;
        long temp = a;
        while (b >= 1) {
            if (b % 2 == 1) {
                c *= temp;
                c %= CONST;
            }
            b /= 2;
            temp = temp * temp % CONST;
        }
        return c;
    }

    public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			long a = sc.nextLong() % CONST;
			long b = sc.nextLong();
			if (a == 0 && b == 0)
				break;
			System.out.println(Pow(a, b));
		}
	}
}