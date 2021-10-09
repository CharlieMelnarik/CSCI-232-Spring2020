import java.util.Random;

public class main {

    public static void main(String[] args) {

        Random rand = new Random();
        Integer[] array = new Integer[100000];
        for (int i =0; i<100000;i++){
            array[i] = rand.nextInt();
        }

        StopWatch watch = new StopWatch();
        MergeSort.sort(array);
        System.out.println("merge sort: "+watch.elapsedTime());

        Random rand1 = new Random();
        Integer[] array1 = new Integer[100000];
        for (int i =0; i<100000;i++){
            array[i] = rand.nextInt();
        }

        StopWatch watch1 = new StopWatch();
        QuickSort.sort(array);
        System.out.println("quick sort: "+watch.elapsedTime());
    }
}
