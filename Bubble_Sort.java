import java.util.Scanner;
public class Bubble_Sort
{
     public static void main(String []args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("How many numbers do you want to store in an array ?");
          int n = sc.nextInt();
          System.out.println("Enter " + n + " numbers : ");
          System.out.println("Note : The numbers must be decimals");

          // declaration of array with "new" operator
          double arr[] = new double[n];

          // syntax to accept double values from the user
          for(int i = 0; i < n; i++)
          {
               arr[i] = sc.nextDouble();
          }
          System.out.println("Enter 'a' or 'A' to sort the numbers in ascending order");
          System.out.println("Enter 'd' or 'D' to sort the numbers in descending order");

          // input of character by user
          char ch = sc.next().charAt(0);

          double t;
          switch(ch)
          {
               case 'a':
               case 'A':
               for(int i = 0; i < (n - 1); i++)
               {
                    for(int j = 0; j < (n - i - 1); j++)
                    {
                         if(arr[j] > arr[j+1])
                         {
                              t = arr[j];
                              arr[j] = arr[j+1];
                              arr[j+1] = t;
                         }
                    }
               }
               System.out.println();
               System.out.println("The sorted list of numbers in ascending order : ");
               for(int i = 0; i < n; i++)
               {
                    System.out.println(arr[i]);
               }
               break;

               case 'd':
               case 'D':
               for(int i = 0; i < (n - 1); i++)
               {
                    for(int j = 0; j < (n - i - 1); j++)
                    {
                         if(arr[j] < arr[j+1])
                         {
                              t = arr[j];
                              arr[j] = arr[j+1];
                              arr[j+1] = t;
                         }
                    }
               }
               System.out.println();
               System.out.println("The sorted list of numbers in descending order : ");
               for(int i = 0; i < n; i++)
               {
                    System.out.println(arr[i]);
               }
               break;

               default:
               System.out.println("Invalid Choice !!!!!");
        }
        sc.close();
    }
}