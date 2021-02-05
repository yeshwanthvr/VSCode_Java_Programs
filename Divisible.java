import java.util.*;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to check the divisibility of a number.");
        System.out.println("For how many numbers do you want to check the divisibility test : ");
        int n = sc.nextInt();
        long Q[] = new long [n];
        System.out.println("Enter " +n+ " numbers : ");
        for(int i = 0; i < n; i++)
        {
            Q[i] = sc.nextLong();
        }
        System.out.println("Pick an option from below :-");
        for(long i = 1000000000; i >= 0; i--);
        for(long i = 1000000000; i >= 0; i--);
        System.out.println("\nEnter 1 to check for the divisibility test by 2");
        System.out.println("Enter 2 to check for the divisibility test by 3");
        System.out.println("Enter 3 to check for the divisibility test by 4");
        System.out.println("Enter 4 to check for the divisibility test by 5");
        System.out.println("Enter 5 to check for the divisibility test by 6");
        System.out.println("Enter 6 to check for the divisibility test by 8");
        System.out.println("Enter 7 to check for the divisibility test by 9");
        System.out.println("Enter 8 to check for the divisibility test by 10");
        System.out.println("Enter 9 to check for the divisibility test by 11");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            for(int i = 0; i < Q.length; i++)
            {
                if(Q[i] % 2 == 0)
                {
                    System.out.println(+Q[i]+ " is divisible by 2.");
                }
                else
                {
                    System.out.println(+Q[i]+ " is not divisible by 2");
                }
            }
            break;   // end of case 1

            case 2:
            for(int i = 0; i < Q.length; i++)
            {
                if(Q[i] % 3 == 0)
                {
                    System.out.println(+Q[i]+ " is divisible by 3.");
                }
                else
                {
                    System.out.println(+Q[i]+ " is not divisible by 3");
                }
            }
            break;   // end of case 2

            case 3:
            for(int i = 0; i < Q.length; i++)
            {
                if(Q[i] % 4 == 0)
                {
                    System.out.println(+Q[i]+ " is divisible by 4.");
                }
                else
                {
                    System.out.println(+Q[i]+ " is not divisible by 4");
                }
            }
            break;  // end of case 3

            case 4:
            for(int i = 0; i < Q.length; i++)
            {
                if(Q[i] % 5 == 0)
                {
                    System.out.println(+Q[i]+ " is divisible by 5.");
                }
                else
                {
                    System.out.println(+Q[i]+ " is not divisible by 5");
                }
            }
            break;  // end of case 4

            case 5:
            for(int i = 0; i < Q.length; i++)
            {
                if(Q[i] % 6 == 0)
                {
                    System.out.println(+Q[i]+ " is divisible by 6.");
                }
                else
                {
                    System.out.println(+Q[i]+ " is not divisible by 6");
                }
            }
            break;  // end of case 5

            case 6:
            for(int i = 0; i < Q.length; i++)
            {
                if(Q[i] % 8 == 0)
                {
                    System.out.println(+Q[i]+ " is divisible by 8.");
                }
                else
                {
                    System.out.println(+Q[i]+ " is not divisible by 8");
                }
            }
            break;  // end of case 6

            case 7:
            for(int i = 0; i < Q.length; i++)
            {
                if(Q[i] % 9 == 0)
                {
                    System.out.println(+Q[i]+ " is divisible by 9.");
                }
                else
                {
                    System.out.println(+Q[i]+ " is not divisible by 9");
                }
            }
            break;

            case 8:
            for(int i = 0; i < Q.length; i++)
            {
                if(Q[i] % 10 == 0)
                {
                    System.out.println(+Q[i]+ " is divisible by 10.");
                }
                else
                {
                    System.out.println(+Q[i]+ " is not divisible by 10");
                }
            }
            break;

            case 9:
            for(int i = 0; i < Q.length; i++)
            {
                if(Q[i] % 11 == 0)
                {
                    System.out.println(+Q[i]+ " is divisible by 11.");
                }
                else
                {
                    System.out.println(+Q[i]+ " is not divisible by 11");
                }
            }
            break;

            default:
            System.out.println("Sorry user, you have entered an invalid option !!!!!");
        }
        sc.close();
    }
}