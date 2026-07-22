
public class search {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,12};
        int size = arr.length;
        int n = 2;

        int number_In_index = ssearch(arr, size, n);

        System.out.println(number_In_index);
    }
//Linear Search
    static int ssearch(int[] arr , int size , int n )
    {
        int i = 0;
        int finInindex = 0 ;

        while(i < size)
        {
           if(n == arr[i])
            {
                finInindex = i;
                break;
            } 
            i++;
        }
        return finInindex;
    }
}
