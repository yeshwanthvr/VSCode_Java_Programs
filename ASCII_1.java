import java.util.*;
public class ASCII_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The list given below shows the ASCII values of all the Uppercase English alphabets.");
        System.out.println();
        System.out.println("Alphabet \t Unicode");
        for(int i = 65; i <= 90; i++)
        {
            System.out.println((char)i + "\t\t" +i);
        }
        sc.close();
    }
}