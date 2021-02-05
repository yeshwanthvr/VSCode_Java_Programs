import java.util.*;
public class Practise_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Q1[] = {7.35 , 12.03 , -4.09 , -0.26 , -9.4 , 25.75 , 6.0 , 18.072 , -3.67 , -20.67};
        double Q2[] = {-8.0 , -0.769 , 5.83 , 2.08 , 9.628 , -6.016 , 19.036 , -15.307 , -2.5 , 10.829};
        double A1[] = new double[10];
        double A2[] = new double[10];
        int l1 = Q1.length;
        int l2 = Q2.length;
        int correct1 = 0;
        int correct2 = 0;
        System.out.println("This program is used to test your knowledge on the method \"Math.floor();\"");
        System.out.println("Enter 1 to answer the questions of set 1");
        System.out.println("Enter 2 to answer the questions of set 2");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Predict the output for the following :- ");
            for(long i = 1000000000; i >= 0; i--);
            for(long i = 1000000000; i >= 0; i--);
            for(int i = 0; i < l1; i++)
            {
                System.out.println("Math.floor(" +Q1[i]+ ");");
            }
            for(int i = 0; i < 10; i++)
            {
                A1[i] = sc.nextDouble();
            }
            for(int i = 0; i < A1.length; i++)
            {
                if(A1[i] == Math.floor(Q1[i]))
                {
                    correct1++;
                }
            }
            System.out.println("\nScore = " +correct1+"/10");
            System.out.println("\nMistakes :-");
            for(int i = 0; i < A1.length; i++)
            {
                if(A1[i] != Math.floor(Q1[i]))
                {
                    System.out.println("Question \t\t Wrong answer \t\t Correct answer");
                    System.out.println(+Q1[i]+ "\t\t\t" +A1[i]+ "\t\t\t" +Math.floor(Q1[i]));
                }
            }
            if(correct1 == 10)
            {
                System.out.println("There are no mistakes. Well done");
            }
            break;

            case 2:
            System.out.println("Predict the output for the following :- ");
            for(long i = 1000000000; i >= 0; i--);
            for(long i = 1000000000; i >= 0; i--);
            for(int i = 0; i < l2; i++)
            {
                System.out.println("Math.floor(" +Q2[i]+ ");");
            }
            for(int i = 0; i < 10; i++)
            {
                A2[i] = sc.nextDouble();
            }
            for(int i = 0; i < A2.length; i++)
            {
                if(A2[i] == Math.floor(Q2[i]))
                {
                    correct2++;
                }
            }
            System.out.println("\nScore = " +correct2+"/10");
            System.out.println("\nMistakes :-");
            for(int i = 0; i < A2.length; i++)
            {
                if(A2[i] != Math.floor(Q2[i]))
                {
                    System.out.println("Question \t\t Wrong answer \t\t Correct answer");
                    System.out.println(+Q2[i]+ "\t\t\t" +A2[i]+ "\t\t\t" +Math.floor(Q2[i]));
                }
            }
            if(correct2 == 10)
            {
                System.out.println("There are no mistakes. Well done");
            }
            break;

            default:
            System.out.println("Invalid Choice !!!!!");
            break;
        }
        sc.close();
    }
}