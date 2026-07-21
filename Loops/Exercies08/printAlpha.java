public class printAlpha {

    public static void main(String[] args) {
        char a = 'a';

        while(a <= 'z')
        {
            System.out.print(a);
            a++;
        }
        System.out.println();

        char z = 'z';

        while(z >= 'a')
        {
            System.out.print(z);
            z--;
        }
    }
}