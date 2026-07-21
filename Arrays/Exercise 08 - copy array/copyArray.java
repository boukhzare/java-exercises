
public class copyArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        int size = arr.length;
        int[] copy = new int[size];  //and also we can use a clone() function to do it directly

        copyarray(arr, copy, size);

        int i = 0;
        while(i < size)
        {
            System.out.println(copy[i]);
            i++;
        }
    }

    static void copyarray(int []arr , int[] copy, int size)
    {   
        int i = 0;
        while(i < size)
        {
            copy[i]  = arr[i];
            i++;
        }
    }
}
