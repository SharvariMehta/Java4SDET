package ex_21_Java_Codes_1_Normal;

public class Palindrome_Check {
    public static void main(String[] args) {
        String m = "Madam";
        String s = m.toLowerCase();
        int i = 0;
        char l = s.charAt(i);
        int j = s.length()-1;
        char k = s.charAt(j);
        System.out.println(l);
        System.out.println(k);

        for(i=0;i<=5;i++)
        {
            for(j = s.length()-1; j>=1; j--)
            {
                if(l == k)
                    System.out.println("l " +l + "k "+k);
            }
        }




    }
}
