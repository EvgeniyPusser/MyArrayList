package lists;

import java.util.Iterator;


public class MyArrayList<T extends Comparable <T> > implements MyList<T> {

    private T[] values;
    private int index;
    int size;
    int capacity;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.index = 0;
        this.size = 0;
        this.capacity = 10;
        try {
            this.values = (T[]) new Comparable[capacity];
        }catch (ClassCastException e){
            e.printStackTrace();
        }
    }

    private void addCapacity(){
        try {
            T[] temp = (T[]) new Comparable[capacity + capacity/2];
            System.arraycopy(values, 0, temp, 0, values.length);
            values = temp;
        }catch (ClassCastException e){
            e.printStackTrace();
        }

    }
    @Override
    public void add(T element) {
        if(size == capacity) {
            addCapacity();
        }
        values[size] = element;
        size++;
    }

    @Override
    public void removeEl(T element) {
//        for (int i = 0; i < size; i++) {
//             T el = values[i];
//             if(el.equals(element)) {
//                 remove(i);
//                    }
//            }

        for (int i = 0; i < size; i++) {
            if (values[i] == element) {
              remove(i);
              size--;
            }
        }
    }

    @Override
    public void remove(int index) {
//        T [] temp = (T[]) new Comparable[capacity - 1];
//        System.arraycopy(values, 0, temp, 0, index );
//
//        int amountElementsAfterIndex= temp.length - index - 1;
//        System.arraycopy(values, index + 1, temp, index, amountElementsAfterIndex);
//        values = temp;
//        size--;
        for (int i = index; i < size; i++) {
            values[i] = values[i+1];
            size--;
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
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            @Override
            public boolean hasNext() {
                return index < values.length;
            }

            @Override
            public T next() {
                return values[index++];
            }
        };
    }
//    @SuppressWarnings("unchecked")
//    public MyArrayList() {
//        this.values = (T[]) new Comparable[capacity];
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public void add(T t) {
//        // код без try-catch будет работать, но
//        // блок try-catch нужен из-за операции down-каста, нужно как-то обработать исключения
//        try {
//            T[] temp = values;
//            values = (T[]) new Comparable[temp.length + 1];
//            //откуда -> с какого элемента -> куда -> с какого элемента -> сколько
//            System.arraycopy(temp, 0, values, 0, temp.length);
//            values[values.length - 1] = t;
//
//        } catch (ClassCastException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public void remove(int index) {
//        try {
//            T[] temp = values;
//            values = (T[]) new Comparable[temp.length - 1];
//            System.arraycopy(temp, 0, values, 0, index);
//            int amountElementsAfterIndex = temp.length - index - 1;
//            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
//            size--;
//        } catch (ClassCastException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public T get(int index) {
//        return values[index];
//    }
//
//    @Override
//    public int size() {
//        return values.length;
//    }
//
//    @Override
//    public void update(int index, T type) {
//        values[index] = type;
//    }
//    @Override
//    public Iterator<T> iterator() {
//        return new Iterator<T>() {
//            @Override
//            public boolean hasNext() {
//                return index < values.length;
//            }
//
//            @Override
//            public T next() {
//                return values[index++];
//            }
//        };
//    }

//    public boolean add(T t) {
//        // код без try-catch будет работать, но
//        // блок try-catch нужен из-за операции down-каста, нужно как-то обработать исключения
//        try {
//            T[] temp = values;
//            values = (T[]) new Object[temp.length + 1];
//            //откуда -> с какого элемента -> куда -> с какого элемента -> сколько
//            System.arraycopy(temp, 0, values, 0, temp.length);
//            values[values.length - 1] = t;
//            return true;
//        } catch (ClassCastException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//    @Override
//    public void add(T element) {
//        if (size == capacity) {
//            addCapacity();
//        }
//            values[size] = element;
//            size++;
//
//        }
//        @Override
//    @SuppressWarnings("unchecked")
//    public void remove(int index) {
//        try {
//            T[] temp = values;
//            values = (T[]) new Object[temp.length - 1];
//            System.arraycopy(temp, 0, values, 0, index);
//            int amountElementsAfterIndex = temp.length - index - 1;
//            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
//        } catch (ClassCastException e) {
//            throw new RuntimeException(e);
//        }
//    }


//    @Override
//    public void delete(int index) {
//        E[] temp = (E[]) new Object[capacity - 1];
//        System.arraycopy(values!=null, 0, temp, 0, index);
//        int amountElementsAfterIndex = temp.length - index - 1;
//        System.arraycopy(values,index + 1, temp, index,
//                amountElementsAfterIndex);
//    }

//    @Override
//    public void delete(E element) {
//        for (int i = 0; i < values.length; i++) {
//            E el = values[i];
//            if (el.equals(element)){
//             delete(i);
//            }
//        }
//    }

//    @Override
//    public E get(int index) {
//        return values[index];
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public Iterator<E> iterator() {
//        return new Iterator<E>() {
//            @Override
//            public boolean hasNext() {
//                return index < values.length;
//            }
//
//            @Override
//            public E next() {
//                return values[index++];
//            }
//        };
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(values[i]).append(",   ");
        }
        if (builder.length() == 1) return "[]";
        builder.deleteCharAt(builder.length()-1).deleteCharAt(builder.length()-1);
        builder.append("]");
        return builder.toString();
    }
    }




