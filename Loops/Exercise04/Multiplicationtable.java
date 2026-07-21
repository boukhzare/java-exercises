import java.util.Scanner;
public class Multiplicationtable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter your nbr : ");
        int n = input.nextInt();
        int i = 1;
        
        while(i <= 10)
        {
        
            System.out.println(n + " * " + i + " = " + (n * i));  
             
           i++;
        }
        
       
    }
}
