/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Taken from Algorithms, 4th edition - by Robert Sedgewick and Kevin Wayne
 */

/******************************************************************************
 *
 *  Data files:
 *  A program with cubic running time. Reads n integers
 *  and counts the number of triples that sum to exactly 0
 *  (ignoring integer overflow).
 * % java ThreeSum 8ints.txt
 * 4
 *
 * % java ThreeSum 1Kints.txt
 *  70
 *
 *  % java ThreeSum 2Kints.txt
 *  528
 *
 *  % java ThreeSum 4Kints.txt
 *  4039
 *
 ******************************************************************************/
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author k57h721
 */
public class ThreeSum {


    /**
     * Returns the number of triples (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}.
     *
     * @param  a the array of integers
     * @return the number of triples (i, j, k) with {@code i < j < k}
     *         such that {@code a[i] + a[j] + a[k] == 0}
     */

    // the complexity is quadratic
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int h = k+1; h < n; h++){
                        if (a[i] + a[j] + a[k] + a[h] == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }



    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {

        //makes a file of random integers
        Random ints = new Random();
        int number;
        String fileName = "random.txt";
        PrintWriter output = new PrintWriter(fileName);

        for (int count = 0; count < 2000; count++) {

            number = ints.nextInt(8000 + 1);
            output.println(number);
        }



        File file = new File(args[0]);

        Scanner scanner = new Scanner("random.txt");

        int max = Integer.parseInt(args[1]);
        int [] a = new int[max];
        int i = 0;

        while (scanner.hasNextInt()) {
            a[i++] = scanner.nextInt();
        }

        StopWatch timer = new StopWatch();
        int count = count(a);
        System.out.println("elapsed time = " + timer.elapsedTime());
        System.out.println(count);
    }
}