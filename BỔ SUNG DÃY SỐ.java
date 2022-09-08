import java.util.*;

public class Test
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = true;

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(sc.nextInt());

		int first = 1;
		int second = list.get(0);

		if (second != first)
		{
			b = false;
			while (first != second)
			{
				System.out.println(first);
				first++;
			}

		}

		for (int i = 0; i < n - 1; i++)
		{
			first = list.get(i);
			second = list.get(i + 1);
			if (second - first != 1)
			{
				b = false;
				do
				{
					first++;
					System.out.println(first);
				} while (second - first != 1);
			}
		}
		if (b)
			System.out.print("Excellent!");
		sc.close();
	}
}