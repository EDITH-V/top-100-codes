import java.util.*;
class positiveornegative{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0)
        {
            System.out.println("Zero");
        }
        else{
            String s = num>0 ? "Positive" : "Negative";
            System.out.println(s);
        }
    }
}