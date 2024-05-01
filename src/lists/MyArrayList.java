package lists;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


public class MyArrayList<T extends Comparable <T> > implements MyList<T> {

    private T[] values;
    private int index;
    private int size;
    private int capacity;


    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.index = 0;
        this.size = 0;
        this.capacity = 10;
        try {
            this.values = (T[]) new Comparable[capacity];
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return values[index++];
            }
        };
    }


    @SuppressWarnings("unchecked")
    @Override
    public void add(T element) {
        if(size == capacity);addCapacity();
        values[size]=element;
        size++;
    }

        @SuppressWarnings("unchecked")
        @Override
        public void addCapacity() {
            try {
                T[] temp = (T[]) new Comparable[capacity + capacity / 2];
                System.arraycopy(values, 0,temp,0,values.length);
                values = temp;
            }
            catch (ClassCastException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void delete(int index) {
        for (int i = index; i < size; i++) {
            values[i] = values[i + 1];

        }size--;
    }

    @Override
    public void deleteEl(T element) {
        for (int i = 0; i < size; i++) {
            if(values[i].equals(element)){ delete(i);}
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

       @Override
    public String toString() {
       StringBuilder builder = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            builder.append(values[i]).append(",  ");
        }
    if(builder.length()==1) return "[]";
    builder.deleteCharAt(builder.length()-1).deleteCharAt(builder.length() - 1);
    builder.append("]");
    return builder.toString();
}
}






