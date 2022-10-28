import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String Convert(String s) {
        String res = "";
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            if (check) {
                char c = s.charAt(i);
                if (c <= 'z' && c >= 'a') {
                    res += (char) ((int) c - 32);
                    check = false;
                }
            } else {
                char c = s.charAt(i);
                if (c == ' ')
                    check = true;
                res += c;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String s = sc.nextLine().trim();
            if (s.equals("END"))
                break;
            else
                System.out.println(Convert(s.toLowerCase()));
        }
        sc.close();
    }
}