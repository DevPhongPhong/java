import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

public static void main(String[] args) {

    File file = new File("Hello.txt");

    try {

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
 }
}