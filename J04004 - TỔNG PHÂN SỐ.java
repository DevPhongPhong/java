package pkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a1, a2, b1, b2, res1, res2;

        a1 = new BigInteger(sc.next());
        b1 = new BigInteger(sc.next());
        a2 = new BigInteger(sc.next());
        b2 = new BigInteger(sc.next());

        res1 = a1.multiply(b2).add(a2.multiply(b1));
        res2 = b1.multiply(b2);
        a1 = res1.gcd(res2);
        res1 = res1.divide(a1);
        res2 = res2.divide(a1);
        try {
            System.out.println(res1 + "/" + res2);
        } catch (Exception e) {
            System.out.println("");
        }
    }
}