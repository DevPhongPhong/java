
// Java Program to find LCM of two large numbers
import java.math.*;
import java.lang.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeSet<String> tree = new TreeSet<String>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            String temp = "" + c;
            tree.add(temp);
        }
        System.out.println(tree.size());
        sc.close();
    }
}