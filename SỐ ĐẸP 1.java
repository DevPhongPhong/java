import java.util.*;

public class test {
    public static boolean ChechTN(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static boolean CheckChan(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - 48) % 2 != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (CheckChan(s) && ChechTN(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}