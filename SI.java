import java.util.*;
public class SI
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,t,r,I,A;
        System.out.println("Enter the principal amount : ");
        p = sc.nextDouble();
        System.out.println("Enter the time taken : ");
        t = sc.nextDouble();
        System.out.println("Enter the rate percent (in %) : ");
        r = sc.nextDouble();
        sc.close();
        I = (p * t * r) / 100.0;
        A = I + p;
        System.out.println("Interest : " +I);
        System.out.println("Amount : " +A);
    }
}