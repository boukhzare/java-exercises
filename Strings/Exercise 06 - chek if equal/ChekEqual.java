// package java-exercises.Strings.Exercise 06 - chek if equal;

public class ChekEqual {


    static boolean chek_equal_towStr(String str , String str2)
    {
        int sizeOfstr = str.length();
        int sizeOfstr2 = str2.length();

        if(sizeOfstr == sizeOfstr2)
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 = "wadie";
        String s2 = "malak";
        
        System.out.println(chek_equal_towStr(s1, s2));
    }

}
