import java.util.Scanner;

class greatestofthreenum{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int temp = a>b?a:b;
            int result = temp>c? temp :c;
            System.out.println(result+" is greater");
        }

    }
}