import java.util.*;
public class Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to calculate the factorial of a number");
        System.out.println("\nEnter 5 numbers : ");
        int n1,n2,n3,n4,n5 = 0;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
        int f1 = 1,f2 = 1,f3 = 1,f4 = 1,f5 = 1;
        for(int i = 1; i <= n1; i++)
        {
            f1 *= i;
        }
        for(int i = 1; i <= n2; i++)
        {
            f2 *= i;
        }
        for(int i = 1; i <= n3; i++)
        {
            f3 *= i;
        }
        for(int i = 1; i <= n4; i++)
        {
            f4 *= i;
        }
        for(int i = 1; i <= n5; i++)
        {
            f5 *= i;
        }
        System.out.println(n1+ "! = " +f1);
        System.out.println(n2+ "! = " +f2);
        System.out.println(n3+ "! = " +f3);
        System.out.println(n4+ "! = " +f4);
        System.out.println(n5+ "! = " +f5);
        sc.close();
    }
}