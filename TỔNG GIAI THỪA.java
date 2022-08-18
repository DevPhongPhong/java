import java.util.ArrayList;
import java.util.Scanner;

public class Test
{

	public static void Method(int n)
	{
		long l=0;
		long temp =1;
		for(int i=1;i<=n;i++)
		{
			temp*=i;
			l+=temp;
		}
		System.out.print(l);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Method(sc.nextInt());
		sc.close();
	}
}
