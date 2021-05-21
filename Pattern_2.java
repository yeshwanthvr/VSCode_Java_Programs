import java.util.*;
public class Pattern_2
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to print a pattern based on your answers :- ");
        System.out.println("Please answer the following questions :- \n");
        System.out.println("Enter the number of rows to be printed : ");
        int r = sc.nextInt();
        System.out.println("Enter a character to be printed in the pattern : ");
        char ch = sc.next().charAt(0);
        System.out.println("Hey user , here is your pattern :- \n");
        for(long i = 1000000000; i >= 0; i--);
        for(int i = 0; i <= r; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}