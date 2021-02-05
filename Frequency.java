import java.util.*;
public class Frequency
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence in uppercase : ");
        String str = sc.nextLine();
        str = str.toUpperCase();
        int i,j,l,f;
        l = str.length();
        System.out.println("\nAlphabet \t Frequency");
        for(i = 65; i <= 90; i++)
        {
            f = 0;
            for(j = 0; j < l; j++)
            {
                if(str.charAt(j) == i)
                {
                    f++;
                }
            }
            if(f > 0)
            {
                System.out.println((char)i+ "\t\t" +f);
            }
        }
        sc.close();
    }
}