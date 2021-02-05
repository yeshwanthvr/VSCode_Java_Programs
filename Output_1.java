import java.util.*;
public class Output_1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to find the output of the expression");
        System.out.println(" v = x + (--z) + (y++) + y ");
        System.out.println("You have to enter the values of x , y and z to calculate the given expression.");
        System.out.println();
        System.out.println("Enter the value of \"x\" ");
        int x = sc.nextInt();
        System.out.println("Enter the value of \"y\" ");
        int y = sc.nextInt();
        System.out.println("Enter the value of \"z\" ");
        int z = sc.nextInt();
        int v;
        sc.close();
        v = x + (--z) + (y++) + y;
        System.out.println("The output : " +v);
    }
}