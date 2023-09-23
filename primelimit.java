import java.util.Scanner;

public class primelimit {
    static int flag=1;
    public void isprime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0){
                    flag++;
                    break;
                }
                else
                    continue;
            }
            if(flag==1)
            System.out.print(n+" ");
            flag=1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            primelimit p = new primelimit();
            if(from<2)
                from=2;
            // if(num==2)
            //System.out.print(2+" ");
            for(int j=from;j<=to;j++)
            {
              p.isprime(j);
            } 
        }
    }
}
