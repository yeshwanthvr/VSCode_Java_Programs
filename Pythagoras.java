import java.util.*;
public class Pythagoras 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double b,p,h;
        System.out.println("Enter the value of the base of the right angled triangle : ");
        b = sc.nextDouble();
        System.out.println("Enter the value of the perpedicular of the right angled triangle : ");
        p = sc.nextDouble();
        sc.close();
        h = Math.sqrt(Math.pow(b , 2) + Math.pow(p, 2));
        System.out.println("The hypotenuse : " +h);
    }
}