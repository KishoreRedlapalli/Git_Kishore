package Q.linkQueue;

/**
 * Created by kredlapa on 1/25/2016.
 */
public class linkQueue
{
    private LinkList theList;
    public linkQueue()
    {
        theList=new LinkList();
    }
    public boolean isEmpty()
    {
        return theList.isEmpty();
    }
    public void enQ(long lData)
    {
        theList.insertLast(lData);
    }
    public long deQ()
    {
        return theList.deleteFirst();
    }
    public void displayQ()
    {
        theList.displayList();
    }
}
