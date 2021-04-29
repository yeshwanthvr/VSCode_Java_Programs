import java.util.*;
public class Area_Perimeter1
{
    public static int Area(int a , int c)
    // Here , 'a' and 'c' are called formal parameters
    // Here , the return data type is int.
    {
        int y = a * c;
        return y;
    }
    public static int Perimeter(int l , int b)
    {
        int z = 2 * (l + b);
        return z;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is based on rectangles.");
        System.out.println("It displays the length and breadth of the rectangles which have equal area and perimeter.");
        System.out.println();
        System.out.println("The output :- ");
        int p , q = 0;
        for(int i = 0; i <= 100; i++)
        {
            for(int j = 0; j <= 100; j++)
            {
                p = Perimeter(i, j); // Here , 'i' and 'j' are called the actual parameters
                q = Area(i, j);
                if(p == q)
                {
                    System.out.println("Length = " +i+ " , Width = " +j);
                }
            }
        }
        sc.close();
    }
}