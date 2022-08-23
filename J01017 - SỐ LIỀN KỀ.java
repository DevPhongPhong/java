import java.util.Scanner;

public class Test {
    public static boolean Check(String s) {
        boolean b = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        while (n > 0) {
            n--;
            s = sc.nextLine();
            System.out.println(Check(s) ? "YES" : "NO");
        }
        sc.close();
    }
}