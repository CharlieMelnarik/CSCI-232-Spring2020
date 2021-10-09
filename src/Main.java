

import java.util.Random;
import java.util.Stack;

public class Main {

    static void push(Stack<Integer> stack) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        stack.push(x);
        }


    static void print_stack(Stack<Integer> stack){

        System.out.println(
                stack.toString().replaceAll("\\[", "").replaceAll("]", " "));

    }

    static void pop(Stack<Integer> stack){
        Integer y = (Integer) stack.pop();
        System.out.println(y + " was popped");
    }

    static void search(Stack<Integer> stack, int element){
        Integer spot = (Integer) stack.search(element);

        if(spot == -1)
            System.out.println(" element not found");
        else
            System.out.println(" element was found at " + spot);
    }


    static void is_empty(Stack<Integer> stack){
        if(stack.empty())
            System.out.println("stack is empty");
        else
            System.out.println("stack isnt empty");
    }

    static void average(Stack<Integer> stack){
        int avg = 0;
        while (stack.size()>0)
           avg += stack.pop();
        int Oavg = avg/19;
        System.out.println("the average of the stack is " + Oavg);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < 20; i++){
            push(stack);
        }
        print_stack(stack);
        pop(stack);
        print_stack(stack);
        is_empty(stack);
        average(stack);
        search(stack, 50);
        is_empty(stack);


    }
}
