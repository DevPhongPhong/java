package pkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(sc.nextLine().trim() + " " + sc.nextLine().trim() + " "
                + (sc.nextDouble() + sc.nextDouble() + sc.nextDouble()));
    }
}
