import java.util.*;
public class Temperature_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"c\" or \"C\" to convert temperature from kelvin to celsius");
        System.out.println("Enter \"k\" or \"K\" to convert temperature from celsius to kelvin");
        char choice = sc.next().charAt(0);
        int num;
        switch(choice)
        {
            case 'c':
            case 'C':
            System.out.println("How many temperatures do you want to convert ?");
            num = sc.nextInt();
            System.out.println("Enter " +num+ " temperatures : ");
            double kc[] = new double[num];
            for(int i = 0; i < num; i++)
            {
                kc[i] = sc.nextDouble();
            }
            for(int i = 0; i < num; i++)
            {
                kc[i] = kc[i] - 273;          // kc[i] -= 273;
            }
            System.out.println();
            System.out.println("The converted temperatures are :");
            System.out.println();
            for(int i = 0; i < num; i++)
            {
                System.out.println(+kc[i]+ " degree celsius");
            }
            break;

            case 'k':
            case 'K':
            System.out.println("How many temperatures do you want to convert ?");
            num = sc.nextInt();
            System.out.println("Enter " +num+ " temperatures :");
            double ck[] = new double[num];
            for(int i = 0; i < num; i++)
            {
                ck[i] = sc.nextDouble();
            }
            for(int i = 0; i < num; i++)
            {
                ck[i] += 273;          // ck[i] = ck[i] + 273
            }
            System.out.println();
            System.out.println("The converted temperatures are :");
            System.out.println();
            for(int i = 0; i < num; i++)
            {
                System.out.println(+ck[i]+ " kelvin");
            }
            break;

            default:
        }
        sc.close();
    }
}
