package Stacks.Classic_Stack;

/**
 * Created by KishoreRP on 10/10/2014.
 */
public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);

        theStack.push(1000);
        theStack.push(1111);
        theStack.push(1001);
        theStack.push(1112);
        theStack.push(1044);
        theStack.push(11434);
        theStack.push(10324);
        theStack.push(113245);
        theStack.push(1001);
        theStack.push(1112);
        theStack.push(1044);
        theStack.push(11434);
        theStack.push(10324);
        theStack.push(113245);

        while (!theStack.isEmpty()) {
            long peepval = theStack.peek();
            System.out.println(peepval + "\n");
            long value = theStack.pop();
            //System.out.println(value + "\n"); //print the item
        }


    }
}
