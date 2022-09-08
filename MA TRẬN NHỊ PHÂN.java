import java.util.*;

public class test {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int count1 = 0;
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 1)
                    count1++;
            }
            if (count1 > 1)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}