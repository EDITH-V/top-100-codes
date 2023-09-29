import java.util.Scanner;

public class oddoreven {
    public static void main(String args[])
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            if(number % 2 != 0) // if number is odd
            {
                System.out.println("odd");
            }
            else // if number is even
                System.out.println("even");
        }
    }

