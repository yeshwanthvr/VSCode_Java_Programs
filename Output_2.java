import java.util.*;
public class Output_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is used to calculate an answer based on the expression ");
        System.out.println(" y+ = (++y) + (y--) + (--y) ");
        System.out.println("Note : The output entirely depends on the value of \"y\" which you must enter");
        System.out.println();
        System.out.println(" Enter the value of \"y\" ");
        int y = sc.nextInt();
        int ans;
        sc.close();    
        ans = y + ((++y) + (y--) + (--y));
        System.out.println("The output : " +ans);
    }    
}
