package CollectionsInJava.Iterators;

import java.util.Iterator;

//using Iterable interface to make our class iterable.
public class GenericList<T> implements Iterable {

   private T[] data;
   private int size;

   public GenericList(){
        this.size=0;
        this.data=(T[]) new Object[100];
   }
    public void add(T item){
        data[size++]=item;
    }
    public T getItemAtIndex(int index){
        return data[index];
    }

    // to implement iterable we have to return an refernce of iterator's implementation.
    // ie an object of some class that implements the Iterator interface.
    // so that we can use this iterator to iterate over the collection
    @Override
    public Iterator<T> iterator() {
        return new GenericListIterator();
    }

    //creating a class which implements Iterator interface;
    // should implement hasNext() and next();
    private class GenericListIterator implements Iterator<T>
    {

        private int index=0;
        @Override
        public boolean hasNext() {

            return index < size;
        }
        @Override
        public T next() {
            return data[index++];
        }
        
    }

}

