import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            long sum = 0;
            Scanner sc = new Scanner(new File("DATA.in"));
            while (sc.hasNext()) {
                String temp = sc.next();
                try {
                    sum += Integer.parseInt(temp);
                } catch (NumberFormatException e) {
                }
            }
            System.out.println(sum);
            sc.close();
        } catch (FileNotFoundException e) {
            
        }

    }
}
