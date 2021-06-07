import java.util.*;
public class Time_3
{
    public static void Calculate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time (in days) : ");
        int input = sc.nextInt();
        int yrs = input / 365;
        int t1 = input % 365;
        int mon = t1 / 30;
        int d = t1 % 30;
        System.out.println("\nThe converted time :\n\n" +yrs+ " Years , " +mon+ " months , " +d+ " days");
        sc.close();
    }
    public static void main(String [] args)
    {
        Calculate();
    }
}