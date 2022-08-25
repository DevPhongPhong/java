import java.util.Scanner;

public class Test {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();

        int xmin = Math.min(x1, x3);
        int ymin = Math.min(y1, y3);
        int xmax = Math.max(x2, x4);
        int ymax = Math.max(y2, y4);
        System.out.println(Math.pow((double) (Math.max(ymax - ymin, xmax - xmin)), 2));
        sc.close();
    }
}
