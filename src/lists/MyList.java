package lists;

public interface MyList <E extends Comparable<E>> extends Iterable<E> {

   void add(E element);

   void removeEl(E element);

   void remove(int index);

   E get(int index);

   int size();

   }