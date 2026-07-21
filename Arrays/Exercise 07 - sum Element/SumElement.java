
public class SumElement {
   public static void main(String[] args) {
    int[] sum = {1,2,3,4,5};
    int size = sum.length;

    int res = 0;
    int i = 0;
    while(i < size)
    {
        res = res + sum[i];

        i++;
    }

    System.out.println(res);
   } 
}
