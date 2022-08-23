import java.util.Scanner;

public class Test {
    public static String Method(int n) {
        if (n == 1)
            return "0";
        if (n == 2)
            return "1";

        String s1 = "0";
        String s2 = "1";
        while (n - 2 > 0) {
            n--;
            String temp = s2;
            s2 = s1 + s2;
            s1 = temp;
        }
        return s2;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        while (x > 0) {
            x--;
            String s = sc.nextLine();
            boolean c = true;
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '0') {
                    c = false;
                    break;
                }
            System.out.println(c ? "YES" : "NO");
        }
    }
}
