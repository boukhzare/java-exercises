public class FindMaxDigit {

    public static void main(String[] args) {
        
        int nbr = 1294;

        int res =  FindMaxDigitt(nbr);
        System.out.println(res);
    }

    static int  FindMaxDigitt(int number)
    {
            int res = 0;

            while(number != 0)
            {
                int digit = number % 10;
                
                if(digit > res)
                {
                    res = digit;
                }
                number = number / 10 ;
            }

            return res;
    }
}