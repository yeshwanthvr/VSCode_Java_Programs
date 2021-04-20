import java.util.*;
public class Concentric_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to calculate the area between two concentric circles.");
        System.out.println();
        double R,r,res;
        System.out.println("Enter the value of the radius of the external circle : ");
        R = sc.nextDouble();                // Syntax for accepting the value from the user
        System.out.println("Enter the value of the radius of the internal circle : ");
        r = sc.nextDouble();                // Syntax for accepting the value from the user
        res = (22.0/7.0) * ((R + r) * (R - r));
        System.out.println("The area between the concentric circles of radii " +r+ " and " +R+ " = "+res);
        sc.close();
    }
}