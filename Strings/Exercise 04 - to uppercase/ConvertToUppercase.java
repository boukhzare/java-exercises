
public class ConvertToUppercase {
    public static void main(String[] args) {
        String str = "wadie";
        //and also we can do it directly by using toUpperCase() function 

        System.out.println(to_upper(str));
       
    }

    static String to_upper(String str)
    {
        char[] chars = str.toCharArray();
        int i = 0;

        while (i < str.length()) {
            if(chars[i] >= 'a' && chars[i] <= 'z')
            {
                chars[i] = (char)(chars[i] - 32);
            }
            i++;
        }

        return new String(chars);
    }
}
