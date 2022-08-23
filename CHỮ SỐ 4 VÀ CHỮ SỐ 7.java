import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s ;
		s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == '4' || s.charAt(i) == '7')
				count++;
		}

		if (count == 4 || count == 7)
			System.out.print("YES");
		else
			System.out.print("NO");
		sc.close();
	}
}