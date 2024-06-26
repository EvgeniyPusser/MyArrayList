import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

        private int index;
        private final T[] values = null;

        public ArrayIterator() {
            index = 0;

        }

        @Override
        public boolean hasNext() {
            return index < values.length;
        }

        @Override
        public T next() {
            return values[index++];
        }
//    private int index;
//    private final T[] values;

//    public ArrayIterator(T[] values) {
//        index = 0;
//        this.values = values;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return index < values.length;
//    }
//
//    @Override
//    public T next() {
//        return values[index++];
//    }
}
