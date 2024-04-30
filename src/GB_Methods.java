import java.util.Iterator;

public interface GB_Methods {
    @SuppressWarnings("unchecked")
    void remove(int index);

    Object get(int index);

    int size();

    void update(int index, Object type);

    Iterator iterator();

    @SuppressWarnings("unchecked")
    boolean add(Object t);
}
