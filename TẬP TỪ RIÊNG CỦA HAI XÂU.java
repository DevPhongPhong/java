import java.util.*;

public class test {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] s1 = sc.nextLine().split(" ");
            String[] s2 = sc.nextLine().split(" ");
            ArrayList<String> sAll = new ArrayList<String>();
            for (int dems1 = 0; dems1 < s1.length; dems1++) {
                boolean b = true;
                for (int dems2 = 0; dems2 < s2.length; dems2++) {
                    if (s1[dems1].equals(s2[dems2])) {
                        b = false;
                        break;
                    }
                }
                if (b && !sAll.contains(s1[dems1]))
                    sAll.add(s1[dems1]);
            }
            for(int dem=0;dem<sAll.size();dem++)
            {
                System.out.print(sAll.get(dem)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}