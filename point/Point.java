/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;
import java.math.*;
/**
 *
 * @author DELL
 */
public class Point {
    private double x,y;
    
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    
    public double distance(Point b){
        double i = (double)Math.sqrt(Math.pow(this.x-b.x, 2)+Math.pow(this.y-b.y, 2));
        return i;
    }
}
