
public class LengthOfAstring {
    public static void main(String[] args) {
        String str = "wadie";

        // we can use directly int len =  str.length();

        // normal java way : 
        // convert a string to ot an array char[] chars = str.toCharArray();
        // but then you are still using another method.

        
        int res = lenStr(str);

        System.out.println(res);

    }

    static int lenStr(String str)
    {
        int i = 0;
        while (i < str.length()){ // In Java String, there is no real solution to create a len() function without using another function like length() or .... {
            i++;
        }
        return i;
    }
}
