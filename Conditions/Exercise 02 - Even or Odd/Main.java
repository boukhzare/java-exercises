import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your nbr : ");
        int nbr = input.nextInt();


        if(nbr % 2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


    }
}
