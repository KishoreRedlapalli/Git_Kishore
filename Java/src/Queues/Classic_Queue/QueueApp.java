package src.Queues.Classic_Queue;

/**
 * Created by kredlapa on 10/14/2014.
 */
class queue
{
    private int maxsize;
    private long[] qArray;
    private int front;
    private int rear;
    private int nItems;

    public queue(int s)
    {
        maxsize=s;
        qArray=new long[maxsize];
        front=0;
        rear=-1;
        nItems=0;
    }
    public void insert(long j)
    {
        qArray[++rear]=j;
        nItems++;
    }
    public long remove()
    {
        long temp=qArray[front++];//read first to a temp variable and increment front
        nItems--;
        return temp;
    }
    public long peekFront()
    {
        return qArray[front];
    }
    public boolean isEmpty()
    {
        return (nItems==0);
    }
    public boolean isFull()
    {
        return (nItems==maxsize);
    }
    public int size()
    {
        return nItems;
    }
}
public class QueueApp
{
    public static void main(String[] args)
    {
        queue theq=new queue(10);

        theq.insert(100);
        theq.insert(200);
        theq.insert(300);
        theq.insert(400);
        theq.insert(500);
        theq.insert(600);
        theq.insert(700);

        theq.remove();//removes 100
        theq.remove();//removes 200

        theq.insert(601);
        theq.insert(701);
        while (!theq.isEmpty())
        {
            long n=theq.remove();
            System.out.println(n+"\n");
        }




    }

}
