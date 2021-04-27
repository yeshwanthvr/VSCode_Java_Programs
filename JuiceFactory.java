import java.util.*;
public class JuiceFactory
{
    String flavor;
    String pack_type;
    int vol;
    int price;
    double amt;
    double dis;
    public JuiceFactory() {
        flavor = "";
        pack_type = "";
        vol = 0;
        price = 0;
        amt = 0.0;
        dis = 0.0;
    }
    public void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello customer , please answer to our questions :- ");
        System.out.println("Enter the flavor of your juice : ");
        flavor = sc.next();
        System.out.println("Enter the type of packaging you want : ");
        pack_type = sc.next();
        System.out.println("How much quantity of juice do you want (in ml) : ");
        vol = sc.nextInt();
        System.out.println("Enter the price given for the juice you ordered : ");
        price = sc.nextInt();
        sc.close();
    }
    public void calculate()
    {
        if(price <= 500)
        dis = 0;
        else if(price > 500 && price <= 750)
        dis = price * (2.5 / 100.0);
        else if(price > 750 && price <= 1000)
        dis = price * (4.0 / 100.0);
        else
        dis = price * (6.5 / 100.0);
        amt = price - dis;
    }
    public void display()
    {
        System.out.println("Flavor : " +flavor);
        System.out.println("Packaging type : " +pack_type);
        System.out.println("Quantity of juice : " +vol);
        System.out.println("Price of juice : " +price);
        System.out.println("Final price of the juice : " +amt);
    }
    public static void main(String [] args)
    {
        JuiceFactory JF = new JuiceFactory();
        JF.input();
        JF.calculate();
        JF.display();
    }
}