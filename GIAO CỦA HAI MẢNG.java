import java.util.*;

public class Test {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (!a.contains(temp))
                a.add(temp);
        }
        for (int i = 0; i < m; i++) {
            int temp = sc.nextInt();
            if (a.contains(temp) && !b.contains(temp))
                b.add(temp);
        }

        b.sort((o1, o2) -> o1 - o2);
        for(int i=0;i<b.size();i++) System.out.print(b.get(i)+" ");
    }
}