public class countDigits {

    public static void main(String[] args) {

        int i = 122;

        int res = countDigitss(i);

        System.out.println(res);
    }

    static int countDigitss(int n)
    {
        
        int count = 0;
        while(n != 0)
        {
            int  digit  = n % 10;
            count ++;
            n = n / 10;
        }

        return count;
    }
}