package J04002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextFloat();
        double height = sc.nextFloat();
        String color = sc.next();
        if (width > 0 && height > 0 && (int) width == width && (int) height == height) {
            System.out.print((int) (2 * (height + width)) + " ");
            System.out.print((int) (height * width) + " ");
            System.out.println(color);
        } else {
            System.out.println("INVALID");
        }
        sc.close();
    }
}
