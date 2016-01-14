package Stacks.LinkStack;

/**
 * Created by kredlapa on 1/14/2016.
 */
public class LinkStackApp
{
    public static void main(String[] args)
    {
        LinkStack theStack=new LinkStack();
        theStack.push(100);
        theStack.push(10);
        theStack.push(101);
        theStack.push(1022);
        theStack.displayStack();
        theStack.pop();
        theStack.pop();
        theStack.displayStack();

    }
}
