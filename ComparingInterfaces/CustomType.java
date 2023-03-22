package CollectionsInJava.ComparingInterfaces;

// to make this class a sortable/comparable one, we have to implement Comparable interface
public class CustomType implements Comparable<CustomType>{
    
    int v1;
    int v2;

    CustomType(int x,int y)
    {
        this.v1=x;
        this.v2=y;
    }

    @Override
    public int compareTo(CustomType o) {

        // for ascending 
        // if cur < o return neg
        //if cur > o return pos
        // else return 0;
        
        return this.v1-o.v1;
    }
    public String toString()
    {
        return +v1+" "+v2;
    }
}

// One problem? with Comparable is, we can only implement the compareTo() for a specific type of sorting
// lets say, we want in descending  for one time ? it is not conventional to change compareTo everytime.
// so bascially Comparable interface is used to provide the default sorting method.

// if we want more , we will use Comparator interface.

