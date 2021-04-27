public class Permutation
{
    public static void main(String [] args)
    {
        System.out.println("This program is going to print all the possible combinations of a 4-digit lock.");
        System.out.println("\nHere are the combinations");
        System.out.println("\n\n");
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                for(int k = 0; k < 10; k++)
                {
                    for(int l = 0; l < 10; l++)
                    {
                        System.out.print(i+ "" +j+ "" +k+ "" +l+ " ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}