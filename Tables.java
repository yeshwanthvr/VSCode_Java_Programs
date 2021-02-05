import java.util.*;
public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers : ");
        int n1,n2,n3,n4,n5,a1,a2,a3,a4,a5;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            a1 = n1 * i;
            a2 = n2 * i;
            a3 = n3 * i;
            a4 = n4 * i;
            a5 = n5 * i;
            System.out.println(+ n1 + " X " + i + " = " + a1 + "\t\t" + n2 + " X " + i + " = " + a2 + "\t\t" + n3 + " X " + i + " = " + a3 + "\t\t" + n4 + " X " + i + " = " + a4 + "\t\t" + n5 + " X " + i + " = " +a5);
        }
        sc.close();
    }
}