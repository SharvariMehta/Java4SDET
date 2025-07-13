package ex_06_Strings;

public class StringBuilder_Methods {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("SharvariMehta");
        System.out.println("Value of sbd is : "+sbd);
        System.out.println("Value of sbd after appending Substring 'Dapoli' to it is : "+sbd.append("Dapoli"));
        System.out.println("Value of sbd after inserting 97 is : "+sbd.insert(8,97));
        System.out.println("Substring 'Dapoli' from String SBD is now deleted ! \nValue of sbd is : "+sbd.delete(15,21));
        System.out.println("Value of sbd after reversing is :"+sbd.reverse());
    }
}
/*
OUTPUT:
Value of sbd is : SharvariMehta
Value of sbd after appending Substring 'Dapoli' to it is : SharvariMehtaDapoli
Value of sbd after inserting 97 is : Sharvari97MehtaDapoli
Substring 'Dapoli' from String SBD is now deleted !
Value of sbd is : Sharvari97Mehta
Value of sbd after reversing is :atheM79iravrahS
 */