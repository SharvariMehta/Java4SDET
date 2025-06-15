package ex_25_Java_Codes_1_Normal;

public class Max_ThreeNumbers {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 14;

        int Max = (a>b)?
                  ((a>c)? a : ((c>b)? c : b)):
                  ((b>c)? b : c);
        System.out.println("Maximum of above three members is : "+ Max);
    }
}
