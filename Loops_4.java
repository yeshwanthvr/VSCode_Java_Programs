public class Loops_4 
{
    public static void main(String[] args) 
    {
        int a = 0;
        while(a < 15)
        {
            a++;
            if(a % 2 == 0)
            {
                continue;
            }
            System.out.print(a + " ");
        }
    }
}