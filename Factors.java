import java.util.*;
public class Factors
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
            System.out.println();
            System.out.println(+i+ " is a factor of " +num);
            }
        }
        sc.close();
    }
}