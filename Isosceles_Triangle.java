import java.util.*;
public class Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to find the area of an isosceles triangle.");
        System.out.println();
        double a,b,area;
        System.out.println("Enter the value of the two equal side of the isosceles triangle : ");
        a = sc.nextDouble();
        System.out.println("Enter the value of the base of the isosceles triangle : ");
        b = sc.nextDouble();
        area = (1.0/4.0) * b * Math.sqrt((4 * Math.pow(a,2)) - Math.pow(b,2));
        System.out.println("Area : " +area);
        sc.close();
    }
}