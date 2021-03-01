import java.util.*;
public class Perfect_Square_Root
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program check if a number is a perfect square root or not.");
        System.out.println("Enter any two numbers of your choice : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a < 0 && b < 0)
        {
            System.out.println("The square root of a negative number is not possible.");
            System.out.println("The program terminates");
            System.exit(0);
        }
        else
        {
            double Aroot = Math.sqrt(a);
            double Broot = Math.sqrt(b);
            double Acheck = Aroot - Math.floor(Aroot);
            double Bcheck = Broot - Math.floor(Broot);
            if(Acheck == 0 && Bcheck == 0)
                System.out.println("Both of the numbers are perfect square roots.");
                else if(Acheck != 0)
                {
                    System.out.println(+a+ " is not a perfect square root");
                    System.out.println(+b+ " is a perfect square root");
                }
                else if(Bcheck != 0)
                {
                    System.out.println(+a+ " is a perfect square root");
                    System.out.println(+b+ " is not a perfect square root");
                }
                else
                {
                    System.out.println("Both are not perfect square roots");
                }
        }
        sc.close();
    }
}