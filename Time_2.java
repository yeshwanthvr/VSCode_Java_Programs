import java.util.*;
public class Time_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time (in hours) : ");
        long h = sc.nextLong();
        System.out.println("Enter the time (in minutes) : ");
        long m = sc.nextLong();
        System.out.println("Enter the time (in seconds) : ");
        long s = sc.nextLong();
        long sum = (h * 3600) + (m * 60) + s;
        System.out.println("\nThe converted time = ");
        System.out.println("\n" +sum+ " seconds");
        sc.close();
    }
}