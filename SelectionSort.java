import java.util.*;
public class SelectionSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort in an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+ " numbers : ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length-1; i++)
        {
            int highest = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] > arr[highest])
                highest = j;
            }
            int temp = arr[i];
            arr[i] = arr[highest];
            arr[highest] = temp;
        }
        System.out.println("\nThe sorted array (in descending order) :- ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(+arr[i]+ " ");
        }
        sc.close();
    }
}