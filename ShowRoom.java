/** This question is taken from Question 4 of Section B of 2019 
 * Computer applications Board paper.
 * 
 * This program is done mostly using constructors
 */
import java.util.*;
public class ShowRoom
{
    String name;
    long mobno;
    double cost , dis , amount;

    // This is a constructor to initialize the variables
    void Showroom()
    {
        name = "";
        mobno = 0;
        cost = 0;
        dis = 0;
        amount = 0;
    }
    
    // This is a constructor to input the values
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Enter your mobile number : ");
        mobno = sc.nextLong();
        System.out.println("Enter the cost of items purchased : ");
        cost = sc.nextDouble();
        sc.close();
    }

    // This is a constructor used to calculate the discount
    void calculate()
    {
        if(cost <= 10000)
            dis = (5.0 / 100.0) * cost;
        else if(cost <= 20000)
            dis = (10.0 / 100.0) * cost;
        else if(cost <= 35000)
            dis = (15.0 / 100.0) * cost;
        else
            dis = (20.0 / 100.0) * cost;
        amount = cost - dis;
    }

    // This is the constructor used to display the result
    void display()
    {
        System.out.println("\nCustomer name = " +name);
        System.out.println("Mobile number = " +mobno);
        System.out.println("Amount to be paid = " +amount);
    }

    public static void main(String args[])
    {
        ShowRoom obj = new ShowRoom();
        obj.Showroom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}