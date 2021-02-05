import java.util.*;
public class Temperature_1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert fahrenheit to celsius");
        System.out.println("Enter 2 to convert celsius to fahrenheit");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        double f,c;
        switch(choice)
        {
            case 1:
            System.out.println("Enter the temperature (in degree fahrenheit) : ");
            f = sc.nextDouble();
            c = (5.0/9.0) * (f-32);
            System.out.println("The converted temperature (in degree celsius) : " +c);
            break;

            case 2:
            System.out.println("Enter the temperature (in degree celsius) : ");
            c = sc.nextDouble();
            f = (1.8 * c) + 32;     // f = ((9.0/5.0) * c) + 32
            System.out.println("The converted temperature (in degree fahrenheit) : " +f);
            break;

            default:
            System.out.println("Invalid Choice !!!!!");
        }
        sc.close();
    }
}
