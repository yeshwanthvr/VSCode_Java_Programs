import java.util.*;
public class Vowel_Consonant 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vCount = 0, cCount = 0;
        int l = str.length();
        char b;
        for(int i = 0; i < l; i++)
        {
            b = str.charAt(i);
            if( b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u')
            {
                vCount++;
            }
            else if(b >= 'a' && b <= 'z')
            {
                cCount++;
            }
        }
        System.out.println("\nThe number of vowels in the given sentence is : " +vCount);
        System.out.println("The number of consonants in the given sentence is : " +cCount);
        sc.close();
    }
}