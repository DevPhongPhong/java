import java.util.ArrayList;
import java.util.Scanner;

public class Test
{
	public static void Method(int n)
	{
		ArrayList<Integer> listIndex = new ArrayList<Integer>();
		ArrayList<Integer> listCount = new ArrayList<Integer>();
		int dem = 2;
		int count = 0;
		while (n >= dem)
		{
			while (n % dem == 0)
			{
				n /= dem;
				count++;
			}
			if (count > 0)
			{
				listIndex.add(dem);
				listCount.add(count);
			}
			dem++;
			count = 0;
		}
		
		for(int i=0;i<listCount.size();i++)
		{
			System.out.print(listIndex.get(i)+"("+listCount.get(i)+") ");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (n >= i)
		{
			System.out.print("Test " + i + ": ");
			Method(sc.nextInt());
			i++;
			System.out.println();
		}
	}
}
