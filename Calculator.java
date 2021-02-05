import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"a\" or \"A\" to add two numbers");
        System.out.println("Enter \"s\" or \"S\" to subtract two numbers");
        System.out.println("Enter \"m\" or \"M\" to multiply two numbers");
        System.out.println("Enter \"d\" or \"D\" to divide two numbers");
        char choice = sc.next().charAt(0);
        double a1,a2,s1,s2,m1,m2,d1,d2;
        double Aans,Sans,Mans,Dans,Drem;
        switch(choice)
        {
            case 'a':
            case 'A':
            System.out.println("Enter two numbers of your own : ");
            a1 = sc.nextDouble();
            a2 = sc.nextDouble();
            Aans = a1 + a2;
            System.out.println("The sum of " +a1+ " and " +a2+ " = " +Aans);
            break;

            case 's':
            case 'S':
            System.out.println("Enter two numbers of your own : ");
            s1 = sc.nextDouble();
            s2 = sc.nextDouble();
            Sans = s1 - s2;
            System.out.println("The difference between " +s1+ " and " +s2+ " = " +Sans);
            break;

            case 'm':
            case 'M':
            System.out.println("Enter two numbers of your own : ");
            m1 = sc.nextDouble();
            m2 = sc.nextDouble();
            Mans = m1 * m2;
            System.out.println("The product of " +m1+ " and " +m2+ " = " +Mans);
            break;

            case 'd':
            case 'D':
            System.out.println("Enter the value of the dividend : ");
            d1 = sc.nextDouble();
            System.out.println("Enter the value of the divisor : ");
            d2 = sc.nextDouble();
            Dans = d1 / d2;
            Drem = d1 % d2;
            System.out.println("The quotient : " +Dans);
            System.out.println("The remainder : " +Drem);
            break;

            default:
            System.out.println("Invalid Choice !!!!!");
        }
        sc.close();
    }
}