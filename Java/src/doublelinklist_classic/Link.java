package doublelinklist_classic;

/**
 * Created by kredlapa on 11/1/2015.
 */
class Link
{
    public long dData;
    public Link previous;
    public Link next;
    public Link(long d)
    {
        dData=d;
    }
    public void displayLink()
    {
        System.out.println("\t"+dData);
    }
}

