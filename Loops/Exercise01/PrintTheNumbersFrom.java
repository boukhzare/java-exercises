import java.util.Scanner;
public class PrintTheNumbersFrom{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your nbr : ");
        int n = input.nextInt();

        
        int i = 0;
        while(i <= n)
        {
            System.out.println(i);
            i++;
        }
    }
}