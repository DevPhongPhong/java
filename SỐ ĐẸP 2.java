import java.util.*;

public class test {
    public static boolean ChechTN(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static boolean Check8(String s) {
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8')
            return false;
        else
            return true;
    }

    public static boolean CheckTong(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += (s.charAt(i) - 48);
        }
        return count % 10 == 0;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (Check8(s) && ChechTN(s)&&CheckTong(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}