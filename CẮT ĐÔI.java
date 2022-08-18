import java.util.Scanner;

public class Test
{

	public static void Method(String s)
	{
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i) == '0')
			{
				if(res!="")
				res += 0;
			}
				
			else if (s.charAt(i) == '1')
				res +=1;
			else if (s.charAt(i) == '8')
			{
				if(res!="")
				res += 0;
			}
			else if (s.charAt(i) == '9')
			{
				if(res!="")
				res += 0;
			}
			else {
				System.out.print("INVALID");
				return;
			}	
		}
		System.out.print(res!="" ? res : "INVALID");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		sc.nextLine();
		while (n >= i)
		{
			Method(sc.nextLine());
			i++;
			System.out.println();
		}
		sc.close();
	}
}
