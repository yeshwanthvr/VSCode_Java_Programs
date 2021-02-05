import java.util.*;
public class Distance_Converter
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert metres to centimetres");
        System.out.println("Enter 2 to convert centimetres to metres");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        double m,cm;
        switch(choice)
        {
            case 1:
            System.out.println("Enter the distance (in metres) : ");
            m = sc.nextDouble();
            cm = m * 100;
            System.out.println("\nThe converted distance : " +cm+ " centimetres ");
            break;

            case 2:
            System.out.println("Ennter the distance (in centimeters) : ");
            cm = sc.nextDouble();
            m = (cm / 100.0);
            System.out.println("\nThe converted distance : " +m+ " meters ");
            break;

            default:
            System.out.println("Invalid Choice !!!!!");
        }
        sc.close();
    }
}