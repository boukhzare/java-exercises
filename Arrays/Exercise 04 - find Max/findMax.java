
public class findMax {
    public static void main(String[] args) {
        int[] arr = {12,2,4,18};
        int size = arr.length;

        int res = findMaxx(arr, size);

        System.out.println(res);
    }

    static int findMaxx(int[] arr , int size)
    {
        int i = 0;
        int max = arr[0];


        while(i < size)
        {
            if(arr[i] > max) // if we want to find min just replace '<' with '>' and variable max with min :)
            {
                max = arr[i];
            }
            i++;
        }


        return max;

    }
}
