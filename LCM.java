import java.util.*;
public class LCM
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers of your own choice : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 0;
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }
        int lcm = (a * b) / gcd;
        System.out.println("\nThe LCM of " +a+ " and " +b+ " = " +lcm);
        sc.close();
    }
}