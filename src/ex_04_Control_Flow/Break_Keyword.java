package ex_04_Control_Flow;

public class Break_Keyword {
    public static void main(String[] args) {
        for(int i =0; i<10;i++)
        {
            System.out.print(" "+i);
            if(i==5)
                break;      //Terminates Execution of Loop when value of i becomes 5.
        }
    }
}
