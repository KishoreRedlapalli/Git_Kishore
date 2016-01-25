package Q.linkQueue;

/**
 * Created by kredlapa on 1/25/2016.
 */
public class linkQueueApp
{
    public static void main(String []args)
    {
        linkQueue theQueue=new linkQueue();
        theQueue.enQ(100);
        theQueue.enQ(1001);
        theQueue.enQ(1003);
        theQueue.displayQ();
        theQueue.deQ();
        theQueue.deQ();
        theQueue.enQ(10013);
        theQueue.displayQ();
    }
}
