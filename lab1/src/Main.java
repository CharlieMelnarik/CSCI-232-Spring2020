
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SuppressWarnings("Duplicates")

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        ArrayStack<String> stack = new ArrayStack<String>(70);

        // pass the path to the file as a parameter
        Scanner inputFile = new Scanner(new File("tinytale.txt"));



        while (inputFile.hasNext()) {
            String str = inputFile.next();



            stack.push(str);
        }
        while (!stack.isEmpty()){

            String file = stack.pop();

            System.out.println(file);
        }

        ArrayStack<String> stack2 = new ArrayStack<String>(70);

        // pass the path to the file as a parameter
        Scanner inputFile2 = new Scanner(new File("numbers.txt"));

//
//
        while (inputFile2.hasNext()) {
            String str2 = inputFile2.next();


            stack2.push(str2);
        }
        while (!stack2.isEmpty()){

            String file2 = stack2.pop();

            System.out.println(file2);
        }



        RArrayStack<String> rstack = new RArrayStack<String>(70);


        // pass the path to the file as a parameter
        Scanner rinputFile = new Scanner(new File("tinytale.txt"));


        while (rinputFile.hasNext()) {
            String rstr = rinputFile.next();


            rstack.push(rstr);
        }
        while (!rstack.isEmpty()){

            String rfile = rstack.pop();

            System.out.println(rfile);
        }

    }


}
