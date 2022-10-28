import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordSet {
    TreeMap<String, Boolean> map;

    public WordSet(String path) throws IOException {
        Scanner sc = new Scanner(new File(path));
        map = new TreeMap<String, Boolean>();
        while (sc.hasNextLine()) {
            String[] s = sc.nextLine().toLowerCase().split(" ");
            for (String item : s) {
                map.put(item, true);
            }
        }
    }

    public String toString() {
        String res = "";
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            res+=entry.getKey()+"\n";
        }
        return res;
    }
}
