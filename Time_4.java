import java.util.*;
public class Time_4
{
    public static void Calculate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of years : ");
        int yrs = sc.nextInt();
        System.out.println("Enter the number of months : ");
        int mon = sc.nextInt();
        System.out.println("Enter the number of days : ");
        int d = sc.nextInt();
        int total = (yrs * 365) + (mon * 30) + d;
        System.out.println("\nThe converted time : \n\n" +total+ " days");
        sc.close();
    }
    public static void main(String [] args)
    {
        Calculate();
    }
}