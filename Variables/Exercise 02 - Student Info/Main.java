
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("enter your name : ");
        String Name = input.next();

        System.out.println("enter your age : ");
        int age = input.nextInt();

        System.out.println("enter your grade : ");
        char grade = input.next().charAt(0);

        boolean student = true;


        System.out.println("======== student Info ========");
        System.out.println("Name : " + Name);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
        System.out.println("Student : " + student);


        
    }
}
