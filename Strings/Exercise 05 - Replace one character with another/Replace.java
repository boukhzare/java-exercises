// package java-exercises.Strings.Exercise 05 - Replace one character with another;

public class Replace {
    
    static String Replace_character(String str , char c)
    {
        char[] chars = str.toCharArray();
        int i = 0;

        while (i < str.length()) 
        {
            
            if(chars[i] == 'a')
            {
               chars[i] = c; 
            }    
            i++;
        }

        return new String(chars);
    }



    public static void main(String[] args) {
        String str = "wadie";
        //we will raplace the first 'a' with another char ,  and also we can replace the last 'a' in string by using int j = str.length() and in while we use j --; 
        char c = 'o';

        System.out.println(Replace_character(str, c));

    }
}
