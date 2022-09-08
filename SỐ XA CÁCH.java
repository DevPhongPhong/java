import java.util.*;
import java.util.stream.IntStream;

public class Test
{
	public static int n;

	public static boolean Check(int[] a)
	{
		for (int i = 0; i < n - 1; i++)
		{
			if (Math.abs(a[i] - a[i + 1]) == 1)
				return false;
		}
		return true;
	}

	public static void method(int[] a)
	{
		while (true)
		{
			int dem = n - 2;
			while (dem >= 0)
			{
				if (a[dem] < a[dem + 1])
					break;
				dem--;
			}

			if (dem == -1)
				return;

			int min = dem + 1;
			for (int i = dem + 2; i < n; i++)
				if (a[i] < a[min] && a[i] > a[dem])
					min = i;

			int temp = a[dem];
			a[dem] = a[min];
			a[min] = temp;

			Arrays.sort(a, dem + 1, n);
			if (Check(a))
			{
				for (int i = 0; i < n; i++)
					System.out.print(a[i]);
				System.out.println();
			}
		}
	}

	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x>0)
		{
			n = sc.nextInt();
			int[] a = IntStream.range(1, 1 + n).toArray();
			method(a);
			x--;
		}
	}
}