package Stacks.LinkStack;

/**
 * Created by kredlapa on 1/14/2016.
 */
public class LinkStack
{
    private LinkList theList;

    public LinkStack()
    {
        theList=new LinkList();
    }
    public void push(long j)
    {
        theList.insertFirst(j);
    }
    public long pop()
    {
        return theList.deleteFirst();
    }
    public void displayStack()
    {
        theList.displayList();
    }
    public boolean isEmpty()
    {
        return (theList.isEmpty());
    }

}
