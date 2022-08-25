import java.util.Scanner;

public class Test {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        while (x > 0) {
            x--;
            long l = sc.nextLong();
            if ((long) Math.sqrt((double) l) * (long) Math.sqrt((double) l) == l)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
