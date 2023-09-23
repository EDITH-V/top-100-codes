import java.util.Scanner;

class prime{
    static int flag=1;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            
            // if(num==2)
            //     System.out.println("prime");
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0){
                    flag++;
                    break;
                }
                else
                    continue;
            }
            if(flag==1)
            System.out.println("prime");
            else
            System.out.println("Not prime");
        }

    }
}