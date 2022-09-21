import java.util.*;

public class Test {
    public static String Get5CharEnd(String s) {
        return "" + s.charAt(5) + s.charAt(6) + s.charAt(7) + s.charAt(9) + s.charAt(10);
    }

    public static boolean Check1(String s) {
        for (int i = 0; i < s.length() - 1; i++)
            if (s.charAt(i) >= s.charAt(i + 1))
                return false;
        return true;
    }

    public static boolean Check23(String s) {
        if (s.charAt(0) == s.charAt(1) &&
                s.charAt(1) == s.charAt(2) &&
                s.charAt(3) == s.charAt(4))
            return true;
        return false;
    }

    public static boolean Check4(String s) {
        for (char c : s.toCharArray()) {
            if (c != '6' && c != '8')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n > 0) {
            n--;
            String s = sc.nextLine();
            boolean b = Check1(Get5CharEnd(s)) || Check23(Get5CharEnd(s)) || Check4(Get5CharEnd(s));
            System.out.println(b ? "YES" : "NO");
        }
        sc.close();
    }
}