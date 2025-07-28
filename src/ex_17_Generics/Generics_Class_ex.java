package ex_17_Generics;

public class Generics_Class_ex {
    public static void main(String[] args) {
        GenericClass i = new GenericClass(13);
        GenericClass s = new GenericClass("Sharvari");
        GenericClass d = new GenericClass(0.2);
        GenericClass b = new GenericClass(true);
        GenericClass c = new GenericClass('m');
    }
}
class GenericClass <T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
        System.out.println(data);
    }
}
/*
OUTPUT:
13
Sharvari
0.2
true
m
 */