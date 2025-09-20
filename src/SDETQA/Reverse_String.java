package SDETQA;




public class Reverse_String {
    public static void main(String[] args) {
        String s = "This is String";
        String rev = " ";

        for(int i=s.length()-1; i>=0; i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        String reve = "";
        for(int j = s.length()-1; j>=0; j--)
        {
            reve = reve + s.charAt(j);
        }
        System.out.println(reve);
    }
}
