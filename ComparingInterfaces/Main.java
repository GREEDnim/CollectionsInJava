package CollectionsInJava.ComparingInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<>();
        list.add(2);list.add(1);
        list.add(4);list.add(3);
        list.add(6);list.add(5);
        list.add(8);list.add(7);
        list.add(10);list.add(9);

        //to sort in ascending 
        // Collections.sort(list);
        // System.out.println(list);

        // how do i sort in descending or lets say in any order?
        // also how do i sort even in ascending if the data type was a custom obj?

        // thats where comparators and comparable interfaces comes in.

        List<CustomType>ls=new ArrayList<>();
        ls.add(new CustomType(0, 4));
        ls.add(new CustomType(1, 3));
        ls.add(new CustomType(2, 2));
        ls.add(new CustomType(3, 1));
        ls.add(new CustomType(4, 0));

        // Collection.sort(ls);
        // gives error The method sort(List<CustomType>) is undefined for the type Collection

        // to sort this list, i have to implement the compare function the sort() internally uses.

        //after implementing Comparable
        Collections.sort(ls);
        System.out.println(ls);

        //after implementing custom Comparator in a new class
        Collections.sort(ls,new V1desc());
        System.out.println(ls);

        // or we can use anonymous inner class
        Collections.sort(ls,new Comparator<CustomType>() {
            public int compare(CustomType a,CustomType b)
            {
                // return - (a.v2-b.v2); or simply
                return b.v2-a.v2;
            }
        });
        System.out.println(ls);

        //or even simpler using lambda 
        Collections.sort(ls,(a,b)->b.v1-a.v1);
        System.out.println(ls);

    }
}

// creating a class which implements a custom comparator
class V1desc implements Comparator<CustomType>{

    @Override
    public int compare(CustomType o1, CustomType o2) {
       return  -(o1.v1-o2.v1);
    }

}