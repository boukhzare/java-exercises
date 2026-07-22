
public class DeleteAnElementFromAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int size = arr.length;
        int deletElemt = 1;

       int[] res =  Delete_an_element_from_ana_rray(arr, size, deletElemt);

       System.out.println(java.util.Arrays.toString(res));

        
    }    

    static int[] Delete_an_element_from_ana_rray(int[] arr , int size , int deletElemt)
    {
        int i = 0;
        int j = 0;
        int[] secArry = new int[size - 1];

        while(i < size)
        {
            if(deletElemt != arr[i])
            {
                secArry[j] = arr[i];
                j++;
            }
            
            i++;
        
        }
        return secArry;
    }
}
