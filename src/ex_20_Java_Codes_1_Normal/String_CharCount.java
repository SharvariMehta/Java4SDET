package ex_20_Java_Codes_1_Normal;

public class String_CharCount {
    public static void main(String[] args) {
        String s = "sharvari";
        char[] aq = s.toCharArray();
        int co = 0;
        char c = 'a';
        for(int i=0; i<s.length();i++)
        {
            if(aq[i] == c)
            {
                co++;
            }
        }
        System.out.println("Number of a in sharvari : "+co);
    }
}
/*
OUTPUT:
Number of a in sharvari : 2
 */