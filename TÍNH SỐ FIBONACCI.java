import java.util.Scanner;

public class Test {
    public static long Check(long n) {      
        if(n==1||n==2) return 1;

        long f0=0;
        long f1=1;
        long f2=1;
        n-=2;
        while (n>0)
        {
            f0=f1;
            f1=f2;
            f2=f1+f0;
            n--;
        }
        return f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (long i = 1; i <= n; i++) {
            System.out.println(Check(sc.nextLong()));
        }
        sc.close();
    }
}