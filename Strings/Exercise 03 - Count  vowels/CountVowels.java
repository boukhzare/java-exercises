
public class CountVowels {
    public static void main(String[] args) {
       String str = "wadie";

      System.out.println( CountVowelss(str)); 
        
    }
    static boolean chekVowels(char c)
    {
        if(c == 'a' || c ==  'e' || c == 'i' || c == 'o' || c == 'u')
        {
            return true;
        }
        return false;
    }

    static int CountVowelss(String str)
    {
        int i = 0;
        int CounVowels = 0 ; 
        while (i < str.length()) {
            char c = str.charAt(i);
            if(chekVowels(c))
            {
                CounVowels ++;
            }
            i++;
        }

        return CounVowels;
    }
}
