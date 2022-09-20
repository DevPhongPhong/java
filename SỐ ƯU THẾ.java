import java.util.*;

public class Test {
	public static boolean CheckNum(String s) {
		if (s.charAt(0) == '0')
			return false;
		for (char c : s.toCharArray())
			if (c > '9' || c < '0')
				return false;
		return true;
	}

	public static boolean CheckSUT(String s) {
		int count2 = 0;
		int count1 = 0;
		for (char c : s.toCharArray())
			if ((c - 48) % 2 == 0)
				count2++;
			else
				count1++;
		if (s.length() % 2 == 1 && count1 > count2)
			return true;
		if (s.length() % 2 == 0 && count2 > count1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			String s = sc.nextLine();
			if (!CheckNum(s))
				System.out.println("INVALID");
			else if (CheckSUT(s))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
