import java.util.*;
public class Exterior_Angle 
{
    int n;
    double ans;
    public void initialization()
    {
        n = 0;
        ans = 0.0;
    }
    public void information()
    {
        System.out.println("This program is used to calculate the value of each exterior angle of a regular polygon.");
        System.out.println("Enter the number of sides of the regular polygon : ");
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
    }
    public void calculate()
    {
        ans = 360 / n;
    }
    public void display()
    {
        System.out.println("In a regular polygon of " +n+ " sides , each exterior angle is equal to " +ans+ " degrees.");
    }
    public static void main(String[] args) {
        Exterior_Angle show = new Exterior_Angle();
        show.initialization();
        show.information();
        show.input();
        show.calculate();
        show.display();
    }
}