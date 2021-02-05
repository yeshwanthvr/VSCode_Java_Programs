import java.util.*;
public class Practise
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Q[] = {7.02 , 6.92 , 5.924 , -2.6 , -26.03 , 14.492 , 7 , -19.825 , -0.45 , 9.27};
        double Q1[] = {-16 , -4.2 , 9.284 , -15.98 , 29.33 , -34.472 , -5 , 0.49 , 7.29 , 12.03};
        double A[] = new double[10];
        double A1[] = new double[10];
        int l = Q.length;
        int l1 = Q1.length;
        int Correct = 0;
        int Correct1 = 0;
        System.out.println("This program is used to test your knowledge on Math.ceil() method");
        System.out.println("Enter 1 to answer questions of set 1");
        System.out.println("Enter 2 to answer questions of set 2");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Give your answers for the following :- ");
            for(long j = 1000000000; j >= 0; j--);
            for(long j = 1000000000; j >= 0; j--);
            for(int i = 0; i < l; i++)
            {
                System.out.println("Math.ceil("+Q[i]+");");
            }
            for(int i = 0; i < 10; i++)
            {
                A[i] = sc.nextDouble();
            }
            for(int i = 0; i < A.length; i++)
            {
                if(A[i] == Math.ceil(Q[i]))
                {
                    Correct++;
                }
            }
            System.out.println("\nScore = " +Correct+"/10");
            System.out.println("\nMistakes :-");
            for(int i = 0; i < A.length; i++)
            {
                if(A[i] != Math.ceil(Q[i]))
                {
                    System.out.println("Question \t\t Wrong answer \t\t Correct answer");
                    System.out.println(+Q[i]+ "\t\t\t" +A[i]+ "\t\t\t" +Math.ceil(Q[i]));
                }
            }
            if(Correct == 10)
            {
                System.out.println("\nThere are no mistakes.");
            }
            break;  //end of case 1

            case 2:
            System.out.println("Give your answers for the following");
            for(long i = 1000000000; i >= 0; i--);
            for(long i = 1000000000; i >= 0; i--);
            for(int i = 0; i < l1; i++)
            {
                System.out.println("Math.ceil("+Q1[i]+");");
            }
            for(int i = 0; i < 10; i++)
            {
                A1[i] = sc.nextDouble();
            }
            for(int i = 0; i < A1.length; i++)
            {
                if(A1[i] == Math.ceil(Q1[i]))
                {
                    Correct1++;
                }
            }
            System.out.println("\nScore = " +Correct1+"/10");
            System.out.println("\nMistakes :-");
            for(int i = 0; i < A1.length; i++)
            {
                if(A1[i] != Math.ceil(Q1[i]))
                {
                    System.out.println("Question \t\t Wrong answer \t\t Correct answer");
                    System.out.println(+Q1[i]+ "\t\t\t" +A1[i]+ "\t\t\t" +Math.ceil(Q1[i]));
                }
            }
            if(Correct1 == 10)
            {
                System.out.println("\nThere are no mistakes.");
            }
            break;  //end of case 2
        }
        sc.close();
    }
}