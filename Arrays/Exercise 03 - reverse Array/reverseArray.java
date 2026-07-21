
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {12,13,11,14};
        int size = arr.length;

        reverseArrayy(arr, size);

        int i = 0;
        while(i < size)
        {
            System.out.println(arr[i]);
            i++;
        }
        
    }

    static void reverseArrayy(int[] arr , int size)
    {
        int i = 0;
        int swap;
        int j = size - 1;

        while(i < j)
        {
            swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;

            i++;
            j--;
        }
    }
}
