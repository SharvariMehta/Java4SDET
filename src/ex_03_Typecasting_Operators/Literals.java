package ex_03_Typecasting_Operators;

public class Literals {
    public static void main(String[] args) {
        int age = 28;                   // Integer Literal
        float pi = 3.14f;               // Floating Literal
        boolean b = true;               // Boolean Literal
        int binary_num = 0b1010;        // Binary Literal
        char c = 'Q';                   // Character Literal
        char s = ' ';                   // Space is also Character Literal

        //Escape Characters:
        char new_line = '\n';           // Adds a new Line
        char tab_line = '\t';           // Adds a tab
        char back_space = '\b';         // Presses Backspace for 1 character
        char carriage_return = '\r';    // Deletes First word

        char smiley = '\u1f60';         // Smiley using ASCII value

        System.out.println( "Integer Literal : " +age);
        System.out.println( "Floating Literal : " +pi);
        System.out.println( "Boolean Literal : " +b);
        System.out.println( "Binary Literal : " +binary_num);
        System.out.println( "Character Literal : " +c);
        System.out.println( "Character Literal : Space : " +s);

        System.out.println("New_Line : "+ "Sharvari"+new_line+"Mehta");
        System.out.println("Tab_Line : "+"Sharvari"+tab_line+"Mehta");
        System.out.println("back_space : "+"Sharvari"+back_space+"Mehta");
        System.out.println("carriage_return : "+"Sharvari"+carriage_return+"Mehta");

        System.out.println(smiley);
    }
}
