
public class TwoSum {
   public static void main(String[] args) {
     
        int[] arr ={1,23,4,2};
        int target = 6;

        int[] res = twoSum(arr, target);

        System.out.println(java.util.Arrays.toString(res));
        
   } 

    static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int i = 0;
        int j;

        while(i < size)
        {
            j = i + 1;
            while (j < size && i != j) {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i, j};
                }
                i++;    
            }
            i++;
        }
        return new int[]{};
    }
}
