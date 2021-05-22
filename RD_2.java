import java.util.*;
public class RD_2
{
    public static double Formula(double prin , double ten , double rate)
    {
        double i = prin * (rate / 100.0) * (ten * (ten+1)) / 24;
        double mv = (prin * ten) + i;
        return mv;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people want to calculate the maturity value for their RD accounts : ");
        int n = sc.nextInt();
        double MV[] = new double[n];
        String name[] = new String[n];
        double p[] = new double[n];
        double t[] = new double[n];
        double r[] = new double[n];
        System.out.println("Note :- please write your initial without leaving a space");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the name of person " +(i+1)+ " : ");
            name[i] = sc.next();
            System.out.print("Enter the monthly installment of " +name[i]+ " (in $) : ");
            p[i] = sc.nextDouble();
            System.out.print("Enter the tenure of the RD account (int months) : ");
            t[i] = sc.nextDouble();
            System.out.print("Enter the rate percent given by your bank : ");
            r[i] = sc.nextDouble();
            System.out.println();
        }
        for(int i = 0; i < n; i++)
        {
            MV[i] = Formula(p[i] , t[i] , r[i]);
        }
        System.out.println("\nName \t\t\tMaturity Value");
        for(int i = 0; i < n; i++)
        {
            System.out.println("\n" +name[i]+ "\t\t\t$" +MV[i]);
        }
        sc.close();
    }
}