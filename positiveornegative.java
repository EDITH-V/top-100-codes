import java.util.*;
class positiveornegative{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0)
        {
            if(num==0)
                System.out.println("Zero");
            else
                System.out.println("Positive");
        }
        else    
            System.out.println("Negative");
    }
}