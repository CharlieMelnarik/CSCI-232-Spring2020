
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args) throws IOException {

        Scanner inputFile = new Scanner(new File("manifesto.txt"));

        int word_cnt = 0;
        List<String> arr = new ArrayList<String>();
        while (inputFile.hasNext())
        {
            String str = inputFile.next();
            word_cnt ++;
            arr.add(str);
        }
        //System.out.println(arr);
        System.out.println("Manifesto has "+word_cnt+" words");
        StopWatch watch1 = new StopWatch();
        Cocktailsort.sort(arr);
        System.out.println("The sort took "+watch1.elapsedTime());

////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner inputFile2 = new Scanner(new File("reals.txt"));

        int word_cnt2 = 0;
        ArrayList<Double> arr2 = new ArrayList<Double>();
        while (inputFile2.hasNextDouble())
        {
            Double str2 = inputFile2.nextDouble();
            word_cnt2 ++;
            arr2.add(str2);
        }
        //System.out.println(arr2);
        System.out.println("Reals has "+word_cnt2+" numbers");
        StopWatch watch = new StopWatch();
        Cocktailsort.sort(arr2);
        System.out.println("The sort took "+watch.elapsedTime());


    }
}
