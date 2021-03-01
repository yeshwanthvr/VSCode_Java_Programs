import java.util.Scanner;
public class Interior_Angle 
{
    int n;
    double ans;
    public void initialize()
    {
        n = 0;
        ans = 0.0;
    }
    public void details()
    {
        System.out.println("This program is used to calculate the sum of the interior angle of a polygon");
        System.out.println("Enter the number of sides of the regular polygon");
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
    }
    public void calculate()
    {
        ans = ((2 * n) - 4) * 90;
    }
    public void display()
    {
        System.out.println("The sum of interior angles of a polygon with " +n+ " sides = " +ans+ " degrees.");
    }
    public static void main(String[] args) {
        Interior_Angle obj = new Interior_Angle();
        obj.initialize();
        obj.details();
        obj.input();
        obj.calculate();
        obj.display();
    }    
}