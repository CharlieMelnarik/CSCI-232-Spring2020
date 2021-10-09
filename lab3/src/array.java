import java.util.Random;
@SuppressWarnings("Duplicates")

public class array {



    public static void main(String[] args) {

        Random rand = new Random();
        Integer[] array = new Integer[5000];
        for (int i =0; i<5000;i++){
            array[i] = rand.nextInt();
        }

        StopWatch watch = new StopWatch();
        InsertionSort.sort(array);
        System.out.println("insertion sort: "+watch.elapsedTime());



        Random rand1 = new Random();
        Integer[] array1 = new Integer[5000];
        for (int i =0; i<5000;i++){
            array[i] = rand.nextInt();
        }

        StopWatch watch1 = new StopWatch();
        SelectionSort.sort(array);
        System.out.println("Selection sort: "+watch.elapsedTime());


        Random rand2 = new Random();
        Integer[] array2 = new Integer[5000];
        for (int i =0; i<5000;i++){
            array[i] = rand.nextInt();
        }

        StopWatch watch2 = new StopWatch();
        ShellSort.sort(array);
        System.out.println("Shell sort: "+watch.elapsedTime());





    }



}
