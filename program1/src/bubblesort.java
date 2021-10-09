import java.util.Arrays;
import java.util.Collections;

public class bubblesort {


// does the bubble sort
    public static void sort(Integer a[]){
        int x = a.length;

        System.out.println("before sorted" +Arrays.toString(a));
        System.out.println("");

        for (int k = 1; k < x; k++) {
            for (int i = 1; i < x; i++) {
                if (a[i-1] > a[i]) {
                    Collections.swap(Arrays.asList(a), i-1, i );
                }
            }
        }

        System.out.println("after bubble sorted"+Arrays.toString(a));
        System.out.println("");
        }



    }
