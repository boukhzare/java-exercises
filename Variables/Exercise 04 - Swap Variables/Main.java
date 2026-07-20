
public class Main {
    public static void main(String[] args) {
        int i = 10;
        int b = 20;

        int temp = i ;
        i = b;
        b = temp;


        System.out.println( "value of i becme b : "+i);
        System.out.println("value of b become i : "+b);
    }
}
