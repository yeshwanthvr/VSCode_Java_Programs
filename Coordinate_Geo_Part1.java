import java.util.*;
public class Coordinate_Geo_Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to calculate the distnce between two coordinates.");
        System.out.println();
        System.out.println("Enter the values of the abscissa and the ordinate of the first coordinate : ");
        double x1,y1,x2,y2,d;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter the values of the abscissa and the ordinate of the second coordinate : ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("The distance between the coordinates (" +x1+ " , " +y2+ ") and (" +x2+ " , " +y2+ ") = " +d);
        sc.close();
    }
}
