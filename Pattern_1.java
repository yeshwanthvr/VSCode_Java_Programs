import java.util.*;
public class Pattern_1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to print a pattern as per your choice.");
        System.out.println("Hello user , please answer to the following questions :- \n");
        System.out.println("Enter the number of rows to be printed : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns to be printed : ");
        int columns = sc.nextInt();
        System.out.println("Enter a character to be printed in the pattern : ");
        char ch = sc.next().charAt(0);
        System.out.println("Hey user , here is your pattern\n");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}