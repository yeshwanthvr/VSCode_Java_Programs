import java.util.*;
public class Time_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time (in seconds) : ");
        long s = sc.nextLong();
        long h = s / 3600;           // To store the number of hours
        s %= 3600;               // Step is given to store the remainder in variable 's' of the step "long h = s / 3600"        System.out.println(s);
        long m = s / 60;          // To store the number of minutes
        s %= 60;       // Step is given to store the remainder in variable 's' of the step "long m = s / 60"
        System.out.println("\nThe converted time = ");
        System.out.println("\n"+h+ " hours , " +m+ " minutes and " +s+ " seconds");
        sc.close();
    }
}