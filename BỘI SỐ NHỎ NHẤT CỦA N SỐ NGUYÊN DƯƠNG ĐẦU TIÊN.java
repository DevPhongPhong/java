import java.util.*;

public class Test
{
	public static long gcd(long a, long b) {
		   if (b==0) return a;
		   return gcd(b,a%b);
		}
	
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		for(long dem =1;dem<=x;dem++)
		{
			long n = sc.nextInt();
			long temp =1;
			for(long i=1;i<=n;i++)
			{
				temp = temp*i/gcd(temp,i);
			}
			System.out.println(temp);
		}
		sc.close();
	}
}