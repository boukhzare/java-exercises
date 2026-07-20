import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enetr your age : ");
        int age = input.nextInt();


        if(age <= 13)
        {
            System.out.println("child");
        }
        else if(age <= 17)
        {
            System.out.println("Teenager");
        }
        else if(age >= 18)
        {
            System.out.println("Adult");
        }
    }
}
