import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("eneter your first nbr : ");
        int number1  = input.nextInt();
        
        System.out.println("eneter your secand nbr : ");
        int number2  = input.nextInt();

        
        int Addetion = number1  +  number2;
        int  Subtraction  = number1  -  number2;
        int Multiplication = number1  *  number2;
        int Division = number1 / number2;
        int Modulo = number1 % number2;

        System.out.println("=========================");

       System.out.println(" addetion : "+ Addetion);
       System.out.println(" Subtraction : "+ Subtraction);
       System.out.println(" Multiplication : "+ Multiplication);
       System.out.println(" Division : "+ Division);
       System.out.println(" Modulo : "+ Modulo);

        // System.out.println(
        //                 " Addetion: 2\n" + //
        //                 " Subtraction: 2\n" + //
        //                 " Multiplication: 3\n" + //
        //                 " Division: 4\n" + //
        //                 " Modulo: 5");

        // System.out.println("choice an operation : ");
        // int op = input.nextInt();


        // if (op == 1) {
            
        //     int res = number1  + number2;

        //     System.out.println("addetion : "+ res);

        // }
        // else if(op == 2)
        // {
        //     int res = number1  -  number2;
        //     System.out.println("Subtraction : "+ res);

        // }
        // else if(op == 3)
        // {
        //     int res = number1  *  number2;
        //     System.out.println("Multiplication : "+ res);
        // }
        //  else if(op == 4)
        // {
        //     int res = number1  *  number2;
        //     System.out.println("Division : "+ res);
        // }
        //  else if(op == 5)
        // {
        //     int res = number1  %  number2;
        //     System.out.println("Modulo : "+ res);
        // }

    }
}
