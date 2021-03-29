import java.util.*;
public class ASCII_CODE
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        for(char i = 'A'; i < 'Z'; i++)
        {
            System.out.println((int)(i));
        }
        sc.close();
    }
}