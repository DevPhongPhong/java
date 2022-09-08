import java.util.*;

public class test {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int count = 1;count<=x;count++) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] c = new int[n][n];
            
            System.out.println("Test "+count+": ");

            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++)
                        c[i][j] += a[i][k] * b[k][j];
                        System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}