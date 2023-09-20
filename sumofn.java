import java.util.Scanner;

public class sumofn {
    public void sum(int n)
    {
        System.out.println((n*(n+101))/2);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sumofn obj = new sumofn();
            obj.sum(n);
        }

    }
    
    
}
