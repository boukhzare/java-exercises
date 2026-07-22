
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int size = arr.length;

        int res = secondlargestelement(arr, size);
        System.out.println(res);
    }


    static int secondlargestelement(int arr[] , int size)
    {
        int max = arr[0]; 
        int secondMax = arr[0];


        int i = 0; 
        while(i < size)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax)
            {
                secondMax = arr[i];
            }

            i++;
        }

        return secondMax;
    }
}
