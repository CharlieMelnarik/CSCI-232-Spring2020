import java.util.Arrays;
import java.util.Collections;
@SuppressWarnings("Duplicates")

public class Cocktailsort {


    // does the Cocktail sort
    public static void sort(Double a[]) {

        int x = a.length;

        boolean was_swaped = true;
        int end_idx = a.length;

        while (was_swaped) {

            was_swaped = false;

            for (int i = 0; i < end_idx - 1; i++)
                {
                    Collections.swap(Arrays.asList(a), i+1, i );


                    was_swaped = true;
                }
            }
            if (was_swaped == false)
            {
                //break;
            }
            was_swaped = false;

            end_idx--;

            for (int i = end_idx - 1; i >= 0; i--)
                {

                    Collections.swap(Arrays.asList(a), i+1, i );

                    was_swaped = true;
                }
            }
        }


