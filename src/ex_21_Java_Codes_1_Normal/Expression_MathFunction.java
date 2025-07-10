package ex_21_Java_Codes_1_Normal;

import java.text.DecimalFormat;
import static java.lang.Math.*;

public class Expression_MathFunction {
    public static void main(String[] args) {
        double x = 10.0;
        double y = 10.0;
        double z = 10.0;
        double a = sqrt(x) + sqrt(y) - abs(z);
        double b = cbrt(a); //Math.cbrt(double a) calculates the cube root of a number.
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Value of 3√(x^2 + y^2 - |z|) = " + df.format(b));
    }
}
/*
OUTPUT:
Value of 3√(x^2 + y^2 - |z|) = -1.54
 */