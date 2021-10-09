import java.util.Arrays;
import java.util.Collections;
@SuppressWarnings("Duplicates")

public class Cocktailsort {


    // does the Cocktail sort
    public static void sort(Integer a[]) {

        int x = a.length;

        boolean was_swaped = true;

        while (was_swaped) {

            was_swaped = false;

            for (int i = 0; i < x - 1; i++) {

                if (a[i] > a[i + 1])
                {
                    Collections.swap(Arrays.asList(a), i+1, i );
                    was_swaped = true;
                }
            }
            if (!was_swaped) {
                break;
            }
            was_swaped = false;

            x--;

            for (int i = x - 1; i >= 0; i--) {

                if (a[i] > a[i + 1])
                {
                    Collections.swap(Arrays.asList(a), i+1, i );
                    was_swaped = true;
                }
            }
        }
        System.out.println("after cocktail sort"+ Arrays.toString(a));
    }
}
