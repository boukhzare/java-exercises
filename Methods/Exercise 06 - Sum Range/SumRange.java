public class SumRange {

    public static void main(String[] args) {
        int start = 5;
        int end = 10;

       int res =  Range(start, end);

       System.out.println(res);

    }

    static int Range(int start , int end)
    {
        int res = 0;
        while(start <= end)
            {
                res = res + start;
                start++;
            } 

            return res ;
    }
}