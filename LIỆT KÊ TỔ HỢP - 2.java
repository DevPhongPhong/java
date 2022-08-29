import java.util.*;
import java.util.stream.IntStream;

public class Test
{
	public static int n;
	public static int k;
	public static int count =1;

	public static void method(int[] a)
	{
		while (true)
		{
			int dem = k - 1;
			while (dem >= 0)
			{
				if (a[dem] != n - k + dem + 1)
					break;
				dem--;
			}
			
			if (dem == -1)
				return;
			
			a[dem]++;
			for (int i = dem + 1; i < k; i++)
				a[i] = a[i - 1] + 1;
			for(int i=0;i<k;i++)
				System.out.print(a[i]);
			System.out.print(" ");
			count++;
		}
	}

	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		int[] a = IntStream.range(1, 1+k).toArray();
		for(int i=0;i<k;i++)
			System.out.print(a[i]);
		System.out.print(" ");
		method(a);
		System.out.println();
		System.out.println("Tong cong co "+count+" to hop");
	}
}