import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc;
        int a;
        int b;
        sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println(0);
        } else {
            System.out.println((a + b) * 2 + " " + (a * b));
        }
        sc.close();
    }
}