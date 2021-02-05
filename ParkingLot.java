/** Question
 * 
 * 1) Define a class called "ParkingLot" with the following description
 * 
 * Instance variables 
 * String vno - To store the vehicle number
 * int hours - To store the number of hours the vehicle is parked at the parking lot
 * double bill - To store the bill amount
 * 
 * Member methods
 * Parkinglot() - To initialize the variables
 * void input() - To store and input the vno and hours
 * void calculate() - To compute the parking charges at the rate of ₹ 30 per hour
 * void display() - To display the details
 */

import java.util.*;
public class ParkingLot
{
    String vno;
    int hours;
    double bill;

    // Constructor used to initialize the variables
    void Parkinglot()
    {
        vno = "";
        hours = 0;
        bill = 0.0;
    }

    // Constructor ued to input and store the values
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your vehicle number : ");
        vno = sc.nextLine();
        System.out.println("How many hours did you spend in the mall : ");
        hours = sc.nextInt();
        sc.close();
    }

    // Constructor used to calculate the parking charges
    void calculate()
    {
        bill = hours * 30;
    }

    // Constructor used to display the details
    void display()
    {
        System.out.println();
        System.out.println("Vehicle number : " +vno);
        System.out.println("Bill to be paid : " +bill);
    }

    public static void main(String[] args) 
    {
        ParkingLot obj = new ParkingLot();
        obj.Parkinglot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}