import java.util.*;

public class Test {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n+m; i++) {
            int temp = sc.nextInt();
            if (!a.contains(temp))
                a.add(temp);
        }
        a.sort((o1, o2) -> o1 - o2);
        for(int i=0;i<a.size();i++) System.out.print(a.get(i)+" ");
    }
}