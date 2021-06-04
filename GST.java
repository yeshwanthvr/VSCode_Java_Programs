import java.util.Scanner;
public class GST
{
     public static void GST1(String n , double d, double gst , double ct) // For intra-state with discount
     {
          double actcost = ct - ((d / 100) * ct);
          double halfGST = gst / 2;
          double CGST = (halfGST / 100) * actcost;
          double SGST = (halfGST / 100) * actcost;
          double total = actcost + CGST + SGST;
          System.out.println("Name : " +n);
          System.out.println("Cost of goods : " +ct);
          System.out.println("Discount (in %) : " +d);
          System.out.println("GST rate (in %) : " +gst);
          System.out.println("Actual cost of goods : " +actcost);
          System.out.println("Amount to be paid : " +total);
     }
     public static void GST2(String n , double gst , double ct)
     {
          double halfGST = gst / 2;
          double CGST = (halfGST / 100) * ct;
          double SGST = (halfGST / 100) * ct;
          double total = ct + CGST + SGST;
          System.out.println("Name : " +n);
          System.out.println("Cost of goods : " +ct);
          System.out.println("GST rate (in %) : " +gst);
          System.out.println("Amount to be paid : " +total);
     }
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("This program is used to calculate GST.");
          System.out.println("Enter your name : ");
          String name = sc.nextLine();
          System.out.println();
          System.out.println("Enter 1 to calculate intra state transaction");
          System.out.println("Enter 2 to calculate inter state transaction");
          int num = sc.nextInt();
          switch(num)
          {
               case 1:
               System.out.println("Enter 'a' if the goods have a discount on them");
               System.out.println("Enter 'b' if the goods do not have a discount on them");
               char ch = sc.next().charAt(0);
               switch(ch)
               {
                    case 'a':
                    case 'A':
                    System.out.println("Enter the cost of the goods : ");
                    double cost = sc.nextDouble();
                    System.out.println("Enter the discount given for the goods : ");
                    double disc = sc.nextDouble();
                    System.out.println("Enter the GST rate : ");
                    double GST = sc.nextDouble();
                    GST1(name , disc , GST , cost);
                    break;

                    case 'b':
                    case 'B':
                    System.out.println("Enter the cost of the goods : ");
                    cost = sc.nextDouble();
                    System.out.println("Enter the GST rate : ");
                    GST = sc.nextDouble();
                    GST2(name , GST , cost);
                    break;

                    default:
                    System.out.println("Invalid choice !!!!!");
               }
               break;

               case 2:
               System.out.println("Enter 'p' if the goods have a discount on them");
               System.out.println("Enter 'r' if the goods do not have a discount on them");
               char letter = sc.next().charAt(0);
               switch(letter)
               {
                    case 'p':
                    case 'P':
                    System.out.println("Enter the cost of the goods : ");
                    double cost = sc.nextDouble();
                    System.out.println("Enter the discount given for the goods : ");
                    double disc = sc.nextDouble();
                    System.out.println("Enter the GST rate : ");
                    double GST = sc.nextDouble();
                    GST1(name , disc , GST , cost);
                    break;

                    case 'r':
                    case 'R':
                    System.out.println("Enter the cost of the goods : ");
                    cost = sc.nextDouble();
                    System.out.println("Enter the GST rate : ");
                    GST = sc.nextDouble();
                    GST2(name , GST , cost);
                    break;

                    default:
                    System.out.println("Invalid choice !!!!!");
               }
               break;
               default:
               System.out.println("Invalid choice !!!!!");
          }
          sc.close();
     }
}