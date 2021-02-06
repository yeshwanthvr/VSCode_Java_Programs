import java.util.*;
public class Current
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to convert the current.");
        System.out.println("\nEnter 1 to convert current from milliAmpere to ampere");
        System.out.println("Enter 2 to convert current from ampere to milliAmpere");
        int choice = sc.nextInt();
        double mA1, a1 , mA2, a2; 
        switch(choice)
        {
            case 1:
            System.out.println("Enter the current in milliAmperes (mA) : ");
            mA1 = sc.nextDouble();
            a1 = mA1 / 1000.0;
            System.out.println("\nThe converted current = " +a1+ " A");
            break;

            case 2:
            System.out.println("Enter the current in amperes (A) : ");
            a2 = sc.nextDouble();
            mA2 = a2 * 1000.0;
            System.out.println("\nThe converted current = " +mA2+ " mA");
            break;

            default:
            System.out.println("Invalid Choice !!!!!");
        }
        sc.close();
    }
}