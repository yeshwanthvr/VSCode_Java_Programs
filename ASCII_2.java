import java.util.*;
public class ASCII_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The list given below shows the ASCII values of all the Lowercase English alphabets.");
        System.out.println();
        System.out.println("Alphabet \t Unicode");
        for(int i = 97; i <= 122; i++)
        {
            System.out.println((char)i + "\t\t" +i);
        }
        sc.close();
    }
}