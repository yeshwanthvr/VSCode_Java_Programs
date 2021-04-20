import java.util.*;
public class Marksheet
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to print the marksheet for the students");
        System.out.println("The grading system is given below :- ");
        System.out.println("\nA = Excellent");
        System.out.println("B = Good");
        System.out.println("C = Fair");
        System.out.println("D = Needs Improvement");
        System.out.println("E = Unsatisfactory");
        System.out.println("\n\nEnter the number of students : ");
        int n = sc.nextInt();
        String student[] = new String[n];
        int EngI[] = new int[n];
        int EngII[] = new int[n];
        int Maths[] = new int[n];
        int Social[] = new int[n];
        int Science[] = new int[n];
        int Computer[] = new int[n];
        System.out.println("Note : Please use a dot before writing the students' initial name instead of a space");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the name of student " +(i+1)+ " : ");
            student[i] = sc.next();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter " +student[i]+ "'s marks in English-I : ");
            EngI[i] = sc.nextInt();
            System.out.println();
            System.out.println("Enter " +student[i]+ "'s marks in English-II : ");
            EngII[i] = sc.nextInt();
            System.out.println();
            System.out.println("Enter " +student[i]+ "'s marks in Mathematics : ");
            Maths[i] = sc.nextInt();
            System.out.println();
            System.out.println("Enter " +student[i]+ "'s marks in Science : ");
            Science[i] = sc.nextInt();
            System.out.println();
            System.out.println("Enter " +student[i]+ "'s marks in Social : ");
            Social[i] = sc.nextInt();
            System.out.println();
            System.out.println("Enter " +student[i]+ "'s marks in Computer : ");
            Computer[i] = sc.nextInt();
            System.out.println();
        }
        sc.close();
    }
}