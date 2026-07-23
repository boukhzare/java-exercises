
public class PrintString {
    public static void main(String[] args) {
        String str  = "wadie";

        // or we can also use  System.out.println(str) will print the entire string for you in one simple step. 
        // i just want how it works behind scene :)

        printStr(str);
        
      
    }
    static void printStr(String str)
    {
        int i = 0;
        while (i < str.length()) {
            System.out.println(str.charAt(i));
            i++;
        }
    }
}
