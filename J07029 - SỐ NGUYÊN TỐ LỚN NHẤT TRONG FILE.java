import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

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

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> l = (ArrayList<Integer>) ois.readObject();
        for (int i : l) {
            if (arr[i] >= 1) {
                arr[i]++;
            }
        }
        int dem=10;
        int i=1000000;
        while(dem>0) {
            i--;
            if (arr[i] - 1 > 0){
                System.out.println(i + " " + (arr[i]-1));
                dem--;
            }
        }
    }
}