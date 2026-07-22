import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,0};

        BubbleSortt(arr);

        System.out.println(java.util.Arrays.toString(arr));
        
    }

    static void BubbleSortt(int[] arr)
    {   
        int i = 0;
        int size = arr.length;

        int j;

        while (i < size) {

            j = i + 1;
            while (j < size) {
                if(arr[i] > arr[j])
                {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
                j++;
            }
            i++;
        }   
    }
}
