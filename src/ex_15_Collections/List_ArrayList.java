package ex_15_Collections;

import java.util.ArrayList;

public class List_ArrayList {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        alist.add("String Datatype");
        alist.add(13);
        alist.add(2.3);
        alist.add('q');
        alist.add(true);
        alist.add(2.3);
        alist.add(13);
        System.out.println("Array List : "+alist);
        System.out.println("Size of Array List : "+alist.size());
        System.out.println("ArrayList alist contains String 13 : "+alist.contains("13"));
        System.out.println("ArrayList alist contains Int 13 : "+alist.contains(13));
        System.out.println("ArrayList alist is Empty : "+alist.isEmpty());
        System.out.println("First Index of int 13 : "+alist.indexOf(13));
        System.out.println("Last Index of int 13 : "+alist.lastIndexOf(13));

        System.out.println("Index of object 13 in ArrayList alist is : "+alist.indexOf(13));
        ArrayList cl = (ArrayList) alist.clone();
        System.out.println("Clone of alist : "+cl);

        System.out.println("------------------------");
        ArrayList nlist = new ArrayList();
        nlist.add(1);
        nlist.add(2);
        nlist.add(3);
        nlist.add(4);
        nlist.add(5);
        System.out.println("Elements of ArrayList nlist are : ");
        for(int i = 0; i<nlist.size();i++) {
            System.out.print(nlist.get(i)+ " ");
        }
        System.out.println();
        System.out.println("Index of elements in ArrayList nlist are : ");
        for(int i = 0; i<nlist.size();i++) {
            System.out.print(i+" ");
        }

    }
}
/*
Array List : [String Datatype, 13, 2.3, q, true, 2.3, 13]
Size of Array List : 7
ArrayList alist contains String 13 : false
ArrayList alist contains Int 13 : true
ArrayList alist is Empty : false
First Index of int 13 : 1
Last Index of int 13 : 6
Index of object 13 in ArrayList alist is : 1
Clone of alist : [String Datatype, 13, 2.3, q, true, 2.3, 13]
------------------------
Elements of ArrayList nlist are :
1 2 3 4 5
Index of elements in ArrayList nlist are :
0 1 2 3 4
 */