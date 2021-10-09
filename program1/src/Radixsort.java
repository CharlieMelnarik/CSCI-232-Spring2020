import java.util.Arrays;

public class Radixsort {


    // returns the largest number
    public static int get_max(Integer[] a){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++){
            if (a[i] > max);
            max = a[i];
        }
        return max;
    }

    // does the radix sort
    public static void sort(Integer a[]) {

        int arr[] = new int[a.length];
        int x = a.length;

        int max_digits = String.valueOf(get_max(a)).length();

        for (int i = 1; i<= Math.pow(10, max_digits); i *= 10){

            int[] place = new int[10];

            for (int j = 0; j < x; j++){

                place [(a[j] / i) % 10]++;
            }
            for (int j = 1; j < place.length; j++){
                place[j] += place[j-1];
            }

            for (int j = a.length -1; j>=0; j--)
            {
                arr[place[(a[j]/ i) % 10]- 1] = a[j];
                place[(a[j]/ i) % 10] --;
            }
            for (int j = 0; j < a.length; j++){
                a[j] = arr[j];
            }

        }
        System.out.println("after radix sorted"+Arrays.toString(a));
        System.out.println("");


    }
}
