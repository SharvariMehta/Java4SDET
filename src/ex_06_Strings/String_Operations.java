package ex_06_Strings;

public class String_Operations {
    public static void main(String[] args) {
        String firstname = "Sharvari";
        System.out.println("Length of String : "+firstname.length());
        System.out.println("Char at Index 2 in String : "+firstname.charAt(2));
        System.out.println("Index of 'a' in String : "+firstname.indexOf('a'));
        System.out.println("Index of Last appearance of 'a' in String : "+firstname.lastIndexOf('a'));
        System.out.println("Substring of String containing characters from Index 2 to Index 6 : "+firstname.substring(2,6));
        System.out.println("Substring of String from Index 5 : "+firstname.substring(5));
        System.out.println("String contains char 'e' : "+firstname.contains("e"));
        System.out.println("Replaced all a with k : "+firstname.replace("a","k"));
        System.out.println("Conversion to Upper Case : "+firstname.toUpperCase());
        System.out.println("Conversion to Lower Case : "+firstname.toLowerCase());

        String s = "Mehta,Sharvari";
        String[] sp = s.split("[,]");
        System.out.println();
        System.out.println("Splitting string Mehta,Sharvari at , : ");
        for(String o : sp){
            System.out.println(o);
        }
        System.out.println();

/*
The split() method splits a string into an array of substrings using a regular expression as the separator.
// commas (,), spaces (\\s), and periods (\\.)
 */

        String name = "Sharvari";
        System.out.println("Using equals function to compare 2 strings : "+(firstname.equals(name)));

        String fullname = " Sharvari Mehta !   ";
        System.out.println("Trimming the String : "+fullname.trim()+"Hello");
        System.out.println("Output without Trimming the String : "+fullname + "Hello");
/*
The trim() method removes whitespace from both ends of a string.
Note: This method does not change the original string.
 */

        String name1 = new String("Sharvari");
        System.out.println("Comparing String stored in SCP to String stored in Heap Memory : "+(name.compareTo(name1)));
/*
Return Value of compareTo:
The method returns an int value indicating the relative order of the objects:
A negative integer: If the invoking object is "less than" the argument object.
Zero: If the invoking object is "equal to" the argument object.
A positive integer: If the invoking object is "greater than" the argument object.
*/
    }
}
/*
OUTPUT:
Length of String : 8
Char at Index 2 in String : a
Index of 'a' in String : 2
Index of Last appearance of 'a' in String : 5
Substring of String containing characters from Index 2 to Index 6 : arva
Substring of String from Index 5 : ari
String contains char 'e' : false
Replaced all a with k : Shkrvkri
Conversion to Upper Case : SHARVARI
Conversion to Lower Case : sharvari

Splitting string Mehta,Sharvari at , :
Mehta
Sharvari

Using equals function to compare 2 strings : true
Trimming the String : Sharvari Mehta !Hello
Output without Trimming the String :  Sharvari Mehta !   Hello
Comparing String stored in SCP to String stored in Heap Memory : 0
 */