import java.util.*;
public class Scalene_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to fing the area of a scalene triangle using the Heron's formula");
        System.out.println();
        double a,b,c,s,area;
        System.out.println("Enter the value of the first side of the triangle : ");
        a = sc.nextInt();
        System.out.println("Enter the value of the second side of the triangle : ");
        b = sc.nextInt();
        System.out.println("Enter the value of the third side of the triangle : ");
        c = sc.nextInt();
        sc.close();
        s = (a + b + c) / 2.0;
        area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("The area : " +area);
    }
}
