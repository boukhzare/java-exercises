public class ReverseNumber {

    public static void main(String[] args) {
        
        int nbr = 123;

        int res = reverseNumber(nbr);
        System.out.println(res);
    }
    static int reverseNumber(int n)
    {
        
        int res = 0;

        
        while(n != 0)
        {
            int digit = n % 10;
            res = res * 10 + digit;
            n = n / 10; 
        }

        return res;
    }

}