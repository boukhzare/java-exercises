import java.util.Scanner;
public class ReadArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("how many numbers do you want to enter !");
        int size = input.nextInt();


        int[] UserArray = new int[size];

        int i = 0;
        while(i < size)
        {
            System.out.println("etner element "+i +" : ");
            UserArray[i] = input.nextInt();

            i++;
        }

        int j = 0;
        while(j < size)
        {
            System.out.println(UserArray[j]);
            j++;
        }
    }
}
