import java.util.*;
public class Sentence_Pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = sc.nextLine();
        System.out.println("\nEnter \"t\" or \"T\" for a triangular pattern");
        System.out.println("Enter \"p\" or \"P\" for an inverted triangular pattern");
        char ch = sc.next().charAt(0);
        int l = str.length();
        int i,j;
        char c;
        switch(ch)
        {
            case 't':
            case 'T':
            for(i = 0; i < l; i++)
            {
                for(j = 0; j <= i; j++)
                {
                    c = str.charAt(j);
                    System.out.print(c);
                }
                System.out.println();
            }
            break;

            case 'p':
            case 'P':
            for(i = l; i >= 1; i--)
            {
                for(j = 0; j < i; j++)
                {
                    c = str.charAt(j);
                    System.out.print(c);
                }
                System.out.println();
            }
            break;

            default:
            System.out.println("Invalid Choice !!!!!");
        }
        sc.close();
    }
}
