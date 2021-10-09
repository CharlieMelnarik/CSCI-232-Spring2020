import java.util.Arrays;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        // creates the array of random numbers
        Random rand = new Random();
        Integer[] array = new Integer[1000];
        int max_size = 500000;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(max_size* Math.random());

        }
        // creates two more arrays that are the same to
        // test with the other sort classes
        Integer[] array1 = new Integer[array.length];
        Integer[] array2 = new Integer[array.length];
        System.arraycopy(array, 0, array1, 0, array.length);
        System.arraycopy(array, 0, array2, 0, array.length);


        // runs the first array with bubble sort and times it
        StopWatch watch = new StopWatch();
        bubblesort.sort(array);
        System.out.println("bubble sort: "+watch.elapsedTime());
        System.out.println("");

        // runs second array with Radix sort
        StopWatch watch1 = new StopWatch();
        Radixsort.sort(array1);
        System.out.println("Radix sort: "+ watch1.elapsedTime());
        System.out.println("");

        // runs the third array with cocktail sort
        StopWatch watch2 = new StopWatch();
        Cocktailsort.sort(array2);
        System.out.println("Cocktail sort: "+ watch2.elapsedTime());
        System.out.println("");





    }
}