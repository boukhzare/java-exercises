import java.util.Scanner;
public class Totalnumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter your nbr : ");
        int n = input.nextInt();
        int i = 1;
        int res = 0;
        while(i < n)
        {

            res = res + i;
            i++;
        }
        
        System.out.println("the sum  result of all numbers from i to n is : "+ res);
    }
}