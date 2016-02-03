package Stacks.LinkStack;

/**
 * Created by kredlapa on 1/14/2016.
 */
public class Link
{
    public long lData;
    public Link next;

    public Link(long ll)
    {
        lData=ll;
    }
    public void displayLink()
    {
        System.out.println("lData "+lData);
    }
}

