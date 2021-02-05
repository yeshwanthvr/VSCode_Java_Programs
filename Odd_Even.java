import java.util.*;
public class Odd_Even
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to find the odd or even numbers within a range");
        System.out.println("Enter 1 to find the odd numbers within a range");
        System.out.println("Enter 2 to find the even numbers within a range");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Let us assume that your range starts from \"m\" and ends with \"n\" .");
            System.out.println("\nEnter the value of \"m\" : ");
            int m1 = sc.nextInt();
            System.out.println("Enter the value of \"n\" : ");
            int n1 = sc.nextInt();
            System.out.println("The odd numbers between " +m1+ " and " +n1+ " are :- ");
            for(int i = m1; i <= n1; i++)
            {
                if(i % 2 == 0)
                continue;
                if(i % 2 != 0)
                System.out.println(i);
            }
            break;

            case 2:
            System.out.println("Let us assume that your range starts from \"m\" and ends with \"n\" .");
            System.out.println("\nEnter the value of \"m\" : ");
            int m2 = sc.nextInt();
            System.out.println("Enter the value of \"n\" : ");
            int n2 = sc.nextInt();
            System.out.println("The even numbers between " +m2+ " and " +n2+ " are :- ");
            for(int j = m2; j <= n2; j++)
            {
                if(j % 2 != 0)
                continue;
                if(j % 2 == 0)
                System.out.println(j);
            }
            break;

            default:
            System.out.println("Invalid Choice !!!!!");
        }
        sc.close();
    }
}