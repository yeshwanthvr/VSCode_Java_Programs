import java.util.*;
public class Prime_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to find prime numbers from a range of numbers.");
        System.out.println("Enter the starting number : ");
        int a = sc.nextInt();
        System.out.println("Enter the ending number : ");
        int z = sc.nextInt();
        int count;
        System.out.println("\nThe prime numbers between " +a+ " and " +z+ " are ");
        for(int i = a; i <= z; i++)
        {
            count = 0;
            for(int j = 1; j <= i; j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}