/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            Point a = new Point(in.nextDouble(),in.nextDouble());
            Point b = new Point(in.nextDouble(),in.nextDouble());
            System.out.printf("%.4f",a.distance(b));
            System.out.println("");
        }
    }
}
