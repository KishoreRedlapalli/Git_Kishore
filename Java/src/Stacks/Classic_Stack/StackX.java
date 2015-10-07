package Stacks.Classic_Stack;

/**
 * Created by KishoreRP on 10/10/2014.
 */
public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        if (!isFull()) {
            stackArray[++top] = j;//increment top insert item
        } else {
            System.out.println("Stack is full");
        }

    }

    public long pop() {
        return stackArray[top--]; //pop item, decrement top
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
