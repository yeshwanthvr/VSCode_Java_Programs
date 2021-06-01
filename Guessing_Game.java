import java.util.*;
public class Guessing_Game
{
    public static void Guesser()
    {
        int guess = 0;
        int tries = 0;
        boolean win = false;
        int num = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello user , welcome to the number guessing challenge");
        System.out.println("I have guessed a number between 1 to 100.");
        while(win == false)
        {
            System.out.println("Enter your guess : ");
            guess = sc.nextInt();
            tries++;
            if(guess == num)
            {
                win = true;
                System.out.println();
                System.out.println("You guessed the number which I guessed.");
                System.out.println("Congratulations !!!!!");
                System.out.println("You took " +tries+ " guesses to find the number which I guessed");
            }
            else if(guess < num)
            {
                System.out.println();
                System.out.println("The number you told is less than the number which I guessed.");
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("The number you told is greater than the number which I guessed.");
                System.out.println();
            }
        }
        sc.close();
    }
    public static void main(String [] args)
    {
        Guesser();
    }
}