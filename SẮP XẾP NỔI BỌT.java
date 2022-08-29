import java.util.*;

public class Test
{
	public static int n;

	public static void method(int[] a)
	{
		boolean b = true;
		int count = 0;
		int buoc = 1;
		while (b)
		{
			for (int i = 0; i < n - 1; i++)
			{
				if (a[i] > a[i + 1])
				{
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				} else
				{
					count++;
				}
			}

			if (count == n - 1)
				b = false;
			else
			{
				count = 0;
				System.out.print("Buoc " + buoc + ": ");
				for (int i = 0; i < n; i++)
				{
					System.out.print(a[i] + " ");
				}
				System.out.println();
			}
			buoc++;
		}
	}

	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}

		method(a);
	}
}
