package Q.linkQueue;

/**
 * Created by kredlapa on 1/25/2016.
 */
class LinkList
{
    private Link first;
    private Link last;
    public LinkList()
    {
        first=null;
        last=null;
    }

    public boolean isEmpty()//true if no Links
    {
        return first==null;
    }

    public void insertLast(long lVal)
    {
        Link newLink=new Link(lVal);
        if (isEmpty())//if link isempty setFirst = new link
        {
            first=newLink;
        }
        else
        {
            last.next=newLink; //old Last=new Link
        }
        last=newLink; //newLink becomes the last link
    }
    public long deleteFirst()
    {
        long temp=first.lData;
        if (first.next==null)//only one item in list, make last  null
        {
            last=null;
        }
        first=first.next; //next of old becomes first
        return temp;
    }
    public void displayList()
    {
        Link current=first;
        while (current!=null)
        {
            current.displayLink();
            current=current.next;
        }
        System.out.println(" ");
    }

}
