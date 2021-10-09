


    import java.util.Iterator;
    import java.util.NoSuchElementException;
    import java.util.Scanner;

    public class ArrayStack <T> {
        private String[] a;  // holds the items
        private int N;       // number of items in stack

        // create an empty stack with given capacity
        public ArrayStack(int capacity) {
            a = new String[capacity];
            N = 0;
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public boolean isFull() {
            return N == a.length;
        }

        public void push (String item) {
            a[N++] = item;
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




