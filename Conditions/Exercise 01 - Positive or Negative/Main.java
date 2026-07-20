import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("enetr a number : ");
    int nbr = input.nextInt();


    if(nbr > 0)
    {
        
    System.out.println("Positive");
    }
    else if(nbr < 0)
    {
        System.out.println("Negative");
    }
    else
    {
     System.out.println("Zero");   
    }

    }
}
