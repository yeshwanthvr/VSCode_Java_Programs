public class Permutation
{
    public void display() {
        System.out.println("This program is going to print all the possible combinations of a 4-digit lock.");
        System.out.println("\nHere are the 10000 combinations of a 4-digit lock :- ");
        System.out.println("\n\n");
        for(long i = 0; i <= 1000000000; i++);
        for(long i = 0; i <= 1000000000; i++);
        for(long i = 0; i <= 1000000000; i++);
    }

    public void calculate() {
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
    
    public static void main(String []args)
    {
        Permutation obj = new Permutation();
        obj.display();
        obj.calculate();
    }
}