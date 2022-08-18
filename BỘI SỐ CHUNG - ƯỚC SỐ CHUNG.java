import java.util.Scanner;

public class Test
{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		while (n > 0)
		{
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			System.out.println(BSCNN(a, b) + " " + USCLN(a, b));
			n--;
		}
	}

	public static long USCLN(long a, long b)
	{
		if (b == 0)
			return a;
		return USCLN(b, a % b);
	}

	public static long BSCNN(long a, long b)
	{
		return (a * b) / USCLN(a, b);
	}
}