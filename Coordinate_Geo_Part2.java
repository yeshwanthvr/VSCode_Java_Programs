import java.util.*;
public class Coordinate_Geo_Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to calculate the distance between a coordinate and the origin.");
        System.out.println("Origin means the coordinate (0 , 0)");
        System.out.println();
        double x,y,d;
        System.out.println("Enter the value of the abscissa of the coordinate : ");
        x = sc.nextDouble();
        System.out.println("Enter the value of the ordinate of the coordinate : ");
        y = sc.nextDouble();
        sc.close();
        d = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("The distance between the coordinates (" +x+ " , " +y+ ") and (0 , 0) = " +d);
    }
}