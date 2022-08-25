import java.util.*;

public class Test
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int dem =1;dem<=x;dem++)
		{
			System.out.println("Test "+ dem +":");
			int n = sc.nextInt();
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				int temp = sc.nextInt();
				
				if(map.get(temp)==null) 
				{
					map.put(temp, 1);
					list.add(temp);
				}
				else
				{
					map.put(temp, map.get(temp) + 1);
				}
			}
			for (int key: list) {
			    System.out.println(key+" xuat hien "+map.get(key)+" lan");
			}
		}
	}
}
