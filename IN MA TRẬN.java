import java.util.*;

public class test {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            x--;
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
            int dem = 0;
            boolean b = true;
            for (int i = 0; i < n; i++) {
                while (true) {
                    System.out.print(a[i][dem]+" ");
                    if (b) {
                        dem++;
                        if (dem == n) {
                            dem--;
                            b = false;
                            break;
                        }
                    } else {
                        dem--;
                        if (dem == -1) {
                            dem++;
                            b = true;
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}