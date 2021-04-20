import java.util.*;
public class Marksheet
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to print the marksheet for the students");
        System.out.println("\n\nEnter the number of students : ");
        int n = sc.nextInt();
        String name[] = new String[n];
        int EngI[] = new int[n];
        int EngII[] = new int[n];
        int Maths[] = new int[n];
        int Social[] = new int[n];
        int Science[] = new int[n];
        int Computer[] = new int[n];
        char engI[] = new char[n];
        char engII[] = new char[n];
        char maths[] = new char[n];
        char social[] = new char[n];
        char science[] = new char[n];
        char computer[] = new char[n];
        System.out.println("Note : Please use a dot before writing the students' initial name instead of a space");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the name of student " +(i+1)+ " : ");
            name[i] = sc.next();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println();
            System.out.print("Enter " +name[i]+ "'s marks in English-I : ");
            EngI[i] = sc.nextInt();
            System.out.print("Enter " +name[i]+ "'s marks in English-II : ");
            EngII[i] = sc.nextInt();
            System.out.print("Enter " +name[i]+ "'s marks in Mathematics : ");
            Maths[i] = sc.nextInt();
            System.out.print("Enter " +name[i]+ "'s marks in Science : ");
            Science[i] = sc.nextInt();
            System.out.print("Enter " +name[i]+ "'s marks in Social : ");
            Social[i] = sc.nextInt();
            System.out.print("Enter " +name[i]+ "'s marks in Computer : ");
            Computer[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if((EngI[i] <= 100) && (EngI[i] > 80))
            engI[i] = 'A';
            if((EngI[i] <= 80) && (EngI[i] > 60))
            engI[i] = 'B';
            if((EngI[i] <= 60) && (EngI[i] > 40))
            engI[i] = 'C';
            if((EngI[i] <= 40) && (EngI[i] > 20))
            engI[i] = 'D';
            if((EngI[i] <= 20) && (EngI[i] > 0))
            engI[i] = 'E';
            if((EngII[i] <= 100) && (EngII[i] > 80))
            engII[i] = 'A';
            if((EngII[i] <= 80) && (EngII[i] > 60))
            engII[i] = 'B';
            if((EngII[i] <= 60) && (EngII[i] > 40))
            engII[i] = 'C';
            if((EngII[i] <= 40) && (EngII[i] > 20))
            engII[i] = 'D';
            if((EngII[i] <= 20) && (EngII[i] > 0))
            engII[i] = 'E';
            if((Maths[i] <= 100) && (Maths[i] > 80))
            maths[i] = 'A';
            if((Maths[i] <= 80) && (Maths[i] > 60))
            maths[i] = 'B';
            if((Maths[i] <= 60) && (Maths[i] > 40))
            maths[i] = 'C';
            if((Maths[i] <= 40) && (Maths[i] > 20))
            maths[i] = 'D';
            if((Maths[i] <= 20) && (Maths[i] > 0))
            maths[i] = 'E';
            if((Social[i] <= 100) && (Social[i] > 80))
            social[i] = 'A';
            if((Social[i] <= 80) && (Social[i] > 60))
            social[i] = 'B';
            if((Social[i] <= 60) && (Social[i] > 40))
            social[i] = 'C';
            if((Social[i] <= 40) && (Social[i] > 20))
            social[i] = 'D';
            if((Social[i] <= 20) && (Social[i] > 0))
            social[i] = 'E';
            if((Science[i] <= 100) && (Science[i] > 80))
            science[i] = 'A';
            if((Science[i] <= 80) && (Science[i] > 60))
            science[i] = 'B';
            if((Science[i] <= 60) && (Science[i] > 40))
            science[i] = 'C';
            if((Science[i] <= 40) && (Science[i] > 20))
            science[i] = 'D';
            if((Science[i] <= 20) && (Science[i] > 0))
            science[i] = 'E';
            if((Computer[i] <= 100) && (Computer[i] > 80))
            computer[i] = 'A';
            if((Computer[i] <= 80) && (Computer[i] > 60))
            computer[i] = 'B';
            if((Computer[i] <= 60) && (Computer[i] > 40))
            computer[i] = 'C';
            if((Computer[i] <= 40) && (Computer[i] > 20))
            computer[i] = 'D';
            if((Computer[i] <= 20) && (Computer[i] > 0))
            computer[i] = 'E';
        }
        System.out.println();
        System.out.println("The grading system is given below :- ");
        System.out.println("\nA = Excellent");
        System.out.println("B = Good");
        System.out.println("C = Fair");
        System.out.println("D = Needs Improvement");
        System.out.println("E = Unsatisfactory");
        System.out.println();
        System.out.println("\t\t\t\t\t\tGrades :-");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Name : " +name[i]+ "\nEnglish-I : " +engI[i]+ "\nEnglish-II : " +engII[i]+ "\nMaths : " +maths[i]+ "\nScience : " +science[i]+ "\nSocial : " +social[i]+ "\nComputer : " +computer[i]);
            System.out.println();
        }
        sc.close();
    }
}