import java.util.*;
public class Pwd_Generator
{
    public static char GenerateCharacter()
    {
        int r = (int)(Math.random() * 75);     // 26 + 26 + 10 + 6 + 7
        if(r < 26)     // Uppercase alphabets     0 - 25
        {
            int ans = r + 65;
            return (char)(ans);
        }
        else if(r < 52)     //Lowercase alphabets     26 - 51
        {
            int ans = r + 71;
            return (char)(ans);
        }
        else if(r < 62)     // Numbers     52 - 61
        {
            int ans = r - 4;
            return (char)(ans);
        }
        else if(r < 68)     //Special characters 1     62 - 67
        {
            int ans = r + 29;
            return (char)(ans);
        }
        else     // Special characters 2     68 - 74
        {
            int ans = r - 33;
            return (char)(ans);
        }
    }
    public static void PrintPwd(String a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.println("\n" +a[i]);
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello user , I am here to generate passwords for you.");
        System.out.println("Please answer to the following questions below :- ");
        System.out.println("\nHow many passwords do you want to generate : ");
        int total = sc.nextInt();
        System.out.println("What should be the length of each password : ");
        int l = sc.nextInt();
        String passwords[] = new String[total];
        for(int i = 0; i < total; i++)
        {
            String random_pwd = "";
            for(int j = 0; j < l; j++)
            {
                random_pwd += GenerateCharacter();
            }
            passwords[i] = random_pwd;
        }
        System.out.println("\nHey user , here are your passwords :- ");
        PrintPwd(passwords);
        sc.close();
    }
}