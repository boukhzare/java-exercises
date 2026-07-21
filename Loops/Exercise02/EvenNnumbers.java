import java.util.Scanner;
public class EvenNnumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter your nbr : ");
        int n = input.nextInt();
        int i = 0;

        while(i <= n)
        {
            if(i % 2 == 0)
            {
                System.out.println("is even : "+ i);
            }
            else
            {
                System.out.println("is odd : "+ i);
            }
            i++;
        }
    }
}
