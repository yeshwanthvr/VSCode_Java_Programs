import java.util.*;
public class Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,per,area;
        System.out.println("This program is used to calculate the area and perimeter of an equilateral triangle.");
        System.out.println();
        System.out.println("Enter the value of the equal side of the triangle : ");
        a = sc.nextDouble();
        sc.close();
        per = a + a + a;
        area = (Math.sqrt(3)/4.0) * Math.pow(a , 2);
        System.out.println("Perimeter : " +per);
        System.out.println("Area : " +area);
    }
}
