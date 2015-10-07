package Stacks.WordReverse;

import java.io.IOException;
import java.io.*;

class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peep() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class Reverser {
    private String input;
    private String output;

    public Reverser(String in) {
        input = in;
    }

    public String doRev() {
        int stackSize = input.length();
        StackX theStackx = new StackX(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            theStackx.push(ch);
        }
        output = "";
        while (!theStackx.isEmpty()) {
            char ch = theStackx.pop();
            output = output + ch;
        }
        return output;
    }
}

public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output = "";
        while (true) {
            System.out.println("Enter a String\n");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed \t" + output);
            if (input.equals(output)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }


    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s1 = br.readLine();
        return s1;
    }
}
