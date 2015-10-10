package Stacks.DelimiterCheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackX {
    private int maxSize;//maxsize of stack
    private char[] stackArr;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArr = new char[maxSize];
        top = -1;
    }

    public void push(char c) //put item on top of stack
    {
        stackArr[+top] = c;
    }

    public char pop() {
        return stackArr[top--];
    }

    public char peep() {
        return stackArr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        input = in;
    }

    public void check() {
        int stackSize = input.length();
        StackX theStackX = new StackX(stackSize);
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStackX.push(ch); //push
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStackX.isEmpty()) {
                        char chx = theStackX.pop();
                        if ((ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '('))
                            System.out.println("Error: " + ch + " at " + j);
                    } else // prematurely empty
                        System.out.println("Error: " + ch + " at " + j);
                    break;
                default: // no action on other characters
                    break;
            }
        }
        if (!theStackX.isEmpty())
            System.out.println("Error: missing right delimiter");
    }


}

public class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.println("Enter String with delimiters");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            BracketChecker theBC = new BracketChecker(input);
            theBC.check();


        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s1 = br.readLine();
        return s1;
    }
}
