package own_collections;

import java.util.*;

public class MyList <T extends Comparable <T>> implements List <T> {

    private int size;
    private T [] array;

    public MyList(){
        array = (T[]) new Comparable[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean add(T t) {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length + 1];
            for (int i = 0; i < array.length;i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (t.compareTo(array[middle]) < 0) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        for (int i = size; i > low; i--) {
            array[i] = array[i - 1];
        }

        array[low] = t;
        size++;
        return true;
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
    public void add(int index, T element) {
        if (index == 0 && index > size) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
    }

    @Override
    public T set(int index, T element) {
        if (index == 0 && index > size) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
        T [] newArray = (T[]) new Object [size];
        return null;
    }

    @Override
    public boolean remove(Object o) {
        T [] newArray = (T[]) new Object [array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (!array[0].equals(o)) {
                newArray[i] = array[i];
            }
            return false;
        }
        array = newArray;
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public T remove(int index) {
        if (index == 0 && size < index) {
            throw new IndexOutOfBoundsException("Invalid index!");
        } else if (array == null) {
            throw new NullPointerException("The array is not initialized yet!");
        }
        T removedElement = array[index];
        T [] newArray = (T[]) new Object [array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[i] = array[i];
            }
        }
        array = newArray;
        size--;
        return removedElement;
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
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
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
    public void clear() {

    }

    @Override
    public T get(int index) {
        if (index == 0 && index > size) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
        return array[index];
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
