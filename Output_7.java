import java.util.*;
public class Output_7
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to print the sum of cubes from 1 to n.");
        System.out.println("\nEnter the value of n : ");
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += Math.pow(i,2);
        }
        System.out.println("\n\nThe sum of cubes from 1 to " +n+ " = " +sum);
        sc.close();
    }
}