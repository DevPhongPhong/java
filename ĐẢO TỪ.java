import java.util.*;

public class Test {
    public static String Rotate(String s) {
        String res = "";
        for (char c : s.toCharArray())
            res = c + res;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n > 0) {
            n--;
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            for (String item : arr)
                System.out.print(Rotate(item) + " ");
            System.out.println();
        }
        sc.close();
    }
}