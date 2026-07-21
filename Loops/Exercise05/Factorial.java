import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);


        System.out.println("enter your nbr : ");
        int n = input.nextInt();

        if(n < 1)
        {
            System.out.println("invalide number!!!");
            return;
        }
        int res = 1;
        while(n >= 1)
        {
            res = res * n;
            n--; 
        }

        System.out.println("the factorial of nemebr is : "+res);
    }
}