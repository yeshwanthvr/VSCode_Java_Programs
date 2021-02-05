import java.util.Scanner;
public class GST
{
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

                    // Calculation
                    double actcost = cost - ((disc / 100) * cost);
                    double halfGST = GST / 2;
                    double CGST = (halfGST / 100) * actcost;
                    double SGST = (halfGST / 100) * actcost;
                    double total = actcost + CGST + SGST;

                    // Printing the result
                    System.out.println();
                    System.out.println("Name : " +name);
                    System.out.println("Discount on goods (in %) : " +disc);
                    System.out.println("GST rate on goods (in %) : " +GST);
                    System.out.println("Cost of goods : " +cost);
                    System.out.println("Actual cost of goods : " +actcost);
                    System.out.println("Total amount to be paid : " +total);
                    break;

                    case 'b':
                    case 'B':
                    System.out.println("Enter the cost of the goods : ");
                    cost = sc.nextDouble();
                    System.out.println("Enter the GST rate : ");
                    GST = sc.nextDouble();

                    // Calculation
                    halfGST = GST / 2;
                    CGST = (halfGST / 100) * cost;
                    SGST = (halfGST / 100) * cost;
                    total = cost + CGST + SGST;

                    // Printing the result
                    System.out.println();
                    System.out.println("Name : " +name);
                    System.out.println("GST rate on goods (in %) : " +GST);
                    System.out.println("Cost of goods : " +cost);
                    System.out.println("Total amount to be paid : " +total);
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

                    // Calculation
                    double actcost = cost - ((disc / 100) * cost);
                    double IGST = (GST / 100) * actcost;
                    double total = actcost + IGST;

                    // Printing the result
                    System.out.println();
                    System.out.println("Name : " +name);
                    System.out.println("Discount on goods (in %) : " +disc);
                    System.out.println("GST rate on goods (in %) : " +GST);
                    System.out.println("Cost of goods : " +cost);
                    System.out.println("Actual cost of goods : " +actcost);
                    System.out.println("Total amount to be paid : " +total);
                    break;

                    case 'r':
                    case 'R':
                    System.out.println("Enter the cost of the goods : ");
                    cost = sc.nextDouble();
                    System.out.println("Enter the GST rate : ");
                    GST = sc.nextDouble();

                    // Calculation
                    IGST = (GST / 100) * cost;
                    total = cost + IGST;

                    // Printing the result    
                    System.out.println();
                    System.out.println("Name : " +name);
                    System.out.println("GST rate on goods (in %) : " +GST);
                    System.out.println("Cost of goods : " +cost);
                    System.out.println("Total amount to be paid : " +total);
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