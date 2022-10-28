import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
            while (sc.hasNextInt()) {
                int name = sc.nextInt();
                try {
                    map.put(name, map.get(name) + 1);
                } catch (NullPointerException e) {
                    map.put(name, 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            sc.close();
        } catch (FileNotFoundException e) {

        } finally {

        }

    }
}