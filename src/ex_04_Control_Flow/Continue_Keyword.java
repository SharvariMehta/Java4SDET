package ex_04_Control_Flow;

public class Continue_Keyword {
    public static void main(String[] args) {
        for(int i = 0; i<=10;i++)
        {
            if(i==5){
                continue;       // Skip below code and move to top
            }
            System.out.print(" " +i);
        }
    }
}
