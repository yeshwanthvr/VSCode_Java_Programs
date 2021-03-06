import java.util.*;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to check the divisibility of a number.");
        System.out.println("For how many numbers do you want to check the divisibility test : ");
        int n = sc.nextInt();
        long Q[] = new long [n];
        System.out.println("Enter " +n+ " numbers : ");
        for(int i = 0; i < n; i++)
        {
            Q[i] = sc.nextLong();
        }
        System.out.println("By which number do you want to check the divisibility of the numbers : ");
        int choice = sc.nextInt();
        System.out.println("Numbers divisible by " +choice+ "\t\t\tNumbers not divisible by " +choice);
        for(int i = 0; i < n; i++)
        {
            if(Q[i] % choice == 0)
            {
                System.out.println(+Q[i]+"\t\t\t\t\t\t----------");
            }
            else
            {
                System.out.println("----------\t\t\t\t\t\t" +Q[i]);
            }
        }
        sc.close();
    }
}