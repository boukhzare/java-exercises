
public class reversStr {
    

    // we can aslo do this like  Printing backwards: 
        //int i = str.length() - 1;

        // while(i >= 0)
        // {
        //     System.out.print(str.charAt(i));
        //     i--;
        // }

    static String revStr(String str)
    {
        int i = 0;
        int j = str.length() - 1;
        char s ;

        char[] chars = str.toCharArray();
        while(i < j)
        {
            s = chars[i];
            chars[i] = chars[j];
            chars[j] = s;
            i++;
            j--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "wadie";
        System.out.println(revStr(str));
    }
}
