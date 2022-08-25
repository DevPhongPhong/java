import java.util.*;

public class Test
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(sc.nextInt());
		int size = list.size();
		for (int i = 0; i < size - 1; i++)
		{
			System.out.print("Buoc " + (i + 1) + ": ");
			for (int j = i + 1; j < size; j++)
				if (list.get(i) > list.get(j))
				{
					Collections.swap(list, i, j);
				}
			for (int k = 0; k < size; k++)
				System.out.print(list.get(k) + " ");
			System.out.println();
		}
	}
}