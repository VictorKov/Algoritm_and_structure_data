package Arrays_classes;

public interface Array<E> {

    void add(E value);

    E get(int index);

    boolean remove(E value);

    E remove(int index);

    int indexOf(E value);

    boolean contains(E value);

    boolean isEmpty();

    int size();

    void display();

    void sortBubble();
    void sortSelect();
    void sortInsert();

    E[] toArray();

    Array<E> copy();

}
