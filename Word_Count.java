import java.util.*;
public class Word_Count 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = sc.nextLine();
        int wCount = 0;
        int l = str.length();
        char b;
        for(int i = 0; i < l; i++)
        {
            b = str.charAt(i);
            if(b == ' ')
            {
                wCount++;
            }
        }
        System.out.println("\nThe number of words : " +(wCount + 1));
        sc.close();
    }
}