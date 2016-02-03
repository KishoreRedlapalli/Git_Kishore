package Q.linkQueue;

/**
 * Created by kredlapa on 1/25/2016.
 */
public class Link
{

    public long lData;
    public Link next;

    public Link( long l)
    {
        lData=l;
    }
    public void displayLink()
    {
        System.out.println("\tlongData\t"+lData);
    }
}

