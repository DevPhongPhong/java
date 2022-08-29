import java.util.*;

public class Test
{
	public static int n;

	public static void method(int[] a)
	{
		for (int i = 0; i < n - 1; i++)
		{
			System.out.print("Buoc "+(i+1)+": ");
			
			int min = a[i + 1];
			int minIndex = i + 1;
			for (int j = i + 1; j < n; j++)
			{
				if (a[j] < min)
				{
					min = a[j];
					minIndex = j;
				}
			}
			
			if(min < a[i])
			{
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}

			for(int k=0;k<n;k++) System.out.print(a[k]+" ");
			System.out.println();
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
