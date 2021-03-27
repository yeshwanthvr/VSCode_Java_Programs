import java.util.*;
public class Output_6
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to print the sum of the series given below till the nth term :- ");
        System.out.println("\ns = 2 + 4 + 8 + 16 + 32 ......... nth term");
        System.out.println("\n\nNow, enter the value of \'n\' : ");
        int n = sc.nextInt();
        int s = 0;
        for(int i = 1; i <= n; i++)
        {
            s += Math.pow(2,i);
        }
        System.out.println("The sum of the above series till the " +n+ " th series is = " +s);
        sc.close();
    }
}