import java.util.*;
public class Natural
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        System.out.println("Enter 10 numbers : ");
        int n = 0;
        for(int i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            s += i;    // Shorthand expression
        }
        System.out.println(n);
        System.out.println("The sum of the 10 numbers = " +s);
        sc.close();
    }
}