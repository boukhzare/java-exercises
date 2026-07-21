
public class countEven {
    public static void main(String[] args) {
        int[] arr = {1,2,2,5};
        int size = arr.length;

        int res = countEvenn(arr, size);


        System.out.println(res);
    }

    static int countEvenn(int[] arr , int size)
    {
        int i = 0;
        int res = 0;
        while(i < size)
        {
            if(arr[i] % 2 == 0)
            {
                res = res + arr[i];
            }

            i++;
        }

        return res;
    }
}
