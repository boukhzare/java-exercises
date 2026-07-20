import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.err.println("enter your n1 : ");
    int n1 = input.nextInt();

    System.err.println("enter your n2 : ");
    int n2 = input.nextInt();

    System.err.println("enter your n3 : ");
    int n3 = input.nextInt();


    if (n1 > n2 && n1 > n3) {
        System.out.println("the begest one is : "+n1);
    }
    else  if(n2 > n1 && n2 > n3)
    {
        System.out.println("the begest one is : "+n2);
    }
    else if(n3 > n1 && n3 > n2)
    {
        System.out.println("the begest one is : "+n3);
    }
   } 
}
