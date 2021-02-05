import java.util.*;
public class Output_5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , p = 1 , s = 0;
        System.out.println("For calculating the series :- ");
        for(long i = 1000000000; i >= 0; i--);
        for(long i = 1000000000; i >= 0; i--);
        System.out.println("\n1 + (1*2) + (1*2*3) + (1*2*3*4)...............(1*2*3*4*.......*n)");
        for(long i = 1000000000; i >= 0; i--);
        for(long i = 1000000000; i >= 0; i--);
        System.out.println("Enter the value of 'n' : ");
        n = sc.nextInt();
        System.out.println();
        System.out.println("value of p\t\t\tvalue of s");
        for(int i = 1; i <= n; i++)
        {
            p *= i;
            s += p;
            System.out.println(+p+ "\t\t\t\t" +s);
        }
        System.out.println("The sum of the series = " +s);
        sc.close();
    }
}