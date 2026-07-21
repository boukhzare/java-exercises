public class countDigits {

    public static void main(String[] args) {

        int i = 55;

        int res = countDigitss(i);

        System.out.println(res);
    }

    static int countDigitss(int n)
    {
        int res = 0;
        
        while(n != 0)
        {
            int  digit  = n % 10;
            res = (res * 10) + digit;
            
            n = n / 10;
        }

        return res;
    }
}