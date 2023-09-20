import java.util.Scanner;

public class greatestoftwonum {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==b)
                System.out.println("Both are Equal");
            else
            {
                if(a>b)
                    System.out.println(a+" is Greater");
                else 
                    System.out.println(b+" is Greater");   
            }
        }

   }
}
