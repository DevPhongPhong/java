import java.util.Scanner;

public class Test {
    public static Long Sum(Long n) 
    {
        return n*(n+1)/2;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        
        for(int i=0;i<n;i++) 
        {
            System.out.println(Sum(sc.nextLong()));
        }

        sc.close();
    }
}