import java.util.*;
public class RD_1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to calculate maturity value for our RD account.");
        System.out.println("Enter the monthly installment (in $) : ");
        int P = sc.nextInt();
        System.out.println("Enter the tenure (in months) : ");
        int n = sc.nextInt();
        System.out.println("Enter the rate of interest : ");
        double r = sc.nextDouble();
        double I = P * (r / 100.0) * (n * (n+1)) / 24;
        double MV = (P * n) + I;
        System.out.println("\nThe maturity value :  $" +MV);
        sc.close();
    }
}