package CollectionsInJava.Iterators;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        GenericList<Integer>list=new GenericList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        //if we need to iterate over this list
        // for(int x:list)
        // we cant do this because , we dont have access to the array data.
        // we wont make it public cus of we lose encapsulation and security issues.

        //how to iterate over this list? we have Iterable Interface.

        // after implementing both Iterator and Iterable we can simple iterate using the iterator.
        Iterator<Integer>iterator=list.iterator();
        while(iterator.hasNext()) System.out.println(iterator.next());

        //or using foreach which does the same thing. 
        
        for( Integer ele:list) System.out.println(ele);
    }
}
