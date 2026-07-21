public class CountNDigit {

    public static void main(String[] args) {
        int n = 2;
        int nbr = 1223;

        int res = CountNDigitt(n, nbr);
        System.out.println(res);


    }
    static int CountNDigitt(int n , int nbr)
    {
        int res = 0;

        while(nbr != 0)
        {
            int digit = nbr % 10;
            if(n == digit)
            {
                res = res + digit;
            }

            nbr = nbr / 10;
        }

        return res;
    }
}