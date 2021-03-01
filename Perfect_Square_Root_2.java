import java.util.*;
public class Perfect_Square_Root_2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to store in an array : ");
        int n = sc.nextInt();
        System.out.println("Enter " +n+ " numbers : ");
        System.out.println("Note : The numbers must not be decimals.");
        int raw[] = new int[n];
        double root[] = new double[n];
        double checking[] = new double[n];
        for(int i = 0; i < n; i++)
        {
            raw[i] = sc.nextInt();
        }
        for(int i = 0; i < raw.length; i++)
        {
            if(raw[i] < 0)
            {
                System.out.println("Please do not give negative numbers as inputs.");
                System.out.println("Square root of a negative numbers is not possible.");
                System.out.println("The program terminates.");
                System.exit(0);
            }
        }
        System.out.println();
        System.out.println("Numbers\t\tPerfect Square Numbers\t\t Non Perfect Square numbers");
        for(int i = 0; i < raw.length; i++)
        {
            root[i] = Math.sqrt(raw[i]);
            checking[i] = root[i] - Math.floor(root[i]);
            if(checking[i] == 0)
            {
                System.out.println(+raw[i]+ " \t\tA perfect square number\t\t----------");
            }
            else
            {
                System.out.println(+raw[i]+ " \t\t\t------\t\t\tNot a perfect square number");
            }
        }
        sc.close();
    }
}