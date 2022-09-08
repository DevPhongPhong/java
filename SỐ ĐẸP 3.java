import java.util.*;

public class test {
    public static boolean ChechTN(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static boolean CheckNT(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (!CheckPrime(s.charAt(i)-48))
                return false;
        }
        return true;
    }

    public static boolean CheckPrime(int n) {
        if(n==1||n==0) return false;
        if(n<=3) return true;
        for(int i=2;i<=Math.sqrt((double)n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (CheckNT(s) && ChechTN(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}