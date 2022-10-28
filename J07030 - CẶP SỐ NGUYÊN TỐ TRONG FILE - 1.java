import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] arr = new int[1000001];
        arr[0] = -1;
        arr[1] = -1;
        for (int i = 2; i <= 1000000; i++) {
            if (arr[i] != -1) {
                arr[i] = 1;
                for (int j = i * 2; j <= 1000000; j += i) {
                    arr[j] = -1;
                }
            }
        }

        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> l1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> l2 = (ArrayList<Integer>) ois2.readObject();

        // Scanner sc = new Scanner(new File("DATA.in"));
        // ArrayList<Integer> l = new ArrayList<Integer>();

        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int n : l1) {
            if (n < 500000) {
                if (arr[n] == 1) {
                    if (arr[1000000 - n] == 1) {
                        if (l2.contains(1000000 - n)) {
                            map.put(n, 1000000-n);
                        }
                    }
                }
            }
        }

        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        ois1.close();
        ois2.close();
    }
}