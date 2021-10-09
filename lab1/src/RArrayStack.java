import java.util.Iterator;
import java.util.NoSuchElementException;

public class RArrayStack <T> {
    private String[] a;  // holds the items
    private int N;       // number of items in stack

    // create an empty stack with given capacity
    public RArrayStack(int capacity) {
        a = new String[8];
        N = 0;
    }

    public void resize ( int capacity){
        Object[] copy = new RArrayStack[capacity];
        for (int i = 0; i < N; i++ ) {
           copy[i] = a[i];
        }

    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public void push (String item) {
        a[N++] = item;
        if (N <= a.length) N *= 2;
    }

    public String pop() {
        return a[--N];
    }

    public String peek() {
        return a[N - 1];
    }

    public Iterator<T> iterator() {
        return (Iterator<T>) new ReverseArrayIterator();
    }

    public class ReverseArrayIterator implements Iterator<T> {
        private int i = N - 1;

        public boolean hasNext() {
            return i >= 0;
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return (T) a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}