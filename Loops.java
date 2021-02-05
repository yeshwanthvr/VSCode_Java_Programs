import java.util.*;   // Declaring Scanner class Package
public class Loops
{
    public static void main(String[] args) {           // Declaring main method
        Scanner sc = new Scanner(System.in);           // Declaring Scanner object
        int i;
        sc.close();

        /* This is a explanation of for loop
        "i = 1" This is the initialization expression
        "i <= 10" This is the test expression
        "i++" This is the update expression
        "System.out.println(i);" This is the body of the loop*/

        for(i = 10; i >=1; i--)
        {
            System.out.println(i);
        }
    }
}