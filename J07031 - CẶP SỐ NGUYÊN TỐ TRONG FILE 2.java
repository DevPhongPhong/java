import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
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
        HashSet<Integer> l1 = new HashSet<Integer>((ArrayList<Integer>) ois1.readObject());
        HashSet<Integer> l2 = new HashSet<Integer>((ArrayList<Integer>) ois2.readObject());

        int sizeL1 = l1.size();
        int sizeL2 = l2.size();

        for (int i : l2) {
            if (arr[i] == 1)
                arr[i] = 2;
        }
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int i : l1) {
            if (i <= 500000)
                if (arr[i] == 1)
                    if (arr[1000000 - i] == 1)
                        if (l1.contains(1000000 - i))
                            map.put(i, 1000000 - i);
        }

        for (int c : map.keySet()) {
            System.out.println(c + " " + map.get(c));
        }

        ois1.close();
        ois2.close();
    }
}