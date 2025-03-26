package own_collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList <T extends Comparable> implements List <T> {

    private int size;
    T [] array;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public boolean add(T t) {
        array[size + 1] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        T [] newArray = new T[array.length - 1];
        for (T tmp : array) {
            if (newArray)
        }
    }

    @Override
    public boolean contains(Object o) {
        for (T tmp : array) {
            if (tmp.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
