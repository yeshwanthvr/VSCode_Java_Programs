import java.util.*;

public class Ranking
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For how many students do you want to calculate average and deviation : ");
        int n = sc.nextInt();
        
        String name[] = new String[n];
        int totalmarks[] = new int[n];
        int grandTotal = 0;
        
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter name of student " + (i+1) + ": ");
            name[i] = sc.nextLine();
            System.out.println("Enter total marks of student " + (i+1) + ": ");
            totalmarks[i] = sc.nextInt();
            System.out.println();
            grandTotal += totalmarks[i];
        }
        
        double avg = grandTotal / (double)n;
        System.out.println("Average = " + avg);
        System.out.println("\nDeviation of the " +n+ " students :- ");
        for (int i = 0; i < n; i++) {
            System.out.println("Deviation for " + name[i] + " = " 
            + (totalmarks[i] - avg));
        }
        sc.close();
    }
}