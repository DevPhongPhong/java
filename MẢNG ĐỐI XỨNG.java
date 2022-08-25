import java.util.*;

public class Test
{
	public static boolean Check(ArrayList<String> list)
	{
		int count = (list.size() + 1) / 2;
		for (int i = 0; i < count; i++)
		{
			if (!list.get(i).equals(list.get(list.size() - 1 - i)))
				return false;
		}
		return true;
	}

	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0)
		{
			n--;
			int count = sc.nextInt();
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < count; i++)
			{
				String s = sc.next();
				list.add(s);
			}
			System.out.println(Check(list) ? "YES" : "NO");
		}
	}
}