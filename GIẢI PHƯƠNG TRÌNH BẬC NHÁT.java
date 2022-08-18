import java.util.Scanner;

public class Test {
    public static void Check(double a, double b) {
        if(a==0) 
        {
            if(b==0) {
                System.out.println("VSN");
            }
            else
            {
                System.out.println("VN");
            }
        }
        else
        {
            Double res = (0-b)/a;
            System.out.printf("%.2f", res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Check(a, b);
    }
}