package doublelinklist_classic;

/**
 * Created by kredlapa on 11/1/2015.
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
    public boolean isEmpty()
    {
        return first==null;
    }
    public void insertFirst(long dd)// insert at front of list
    {
        Link newLink=new Link(dd);
        if (isEmpty())
        {
            last=newLink; //newlink<-- last
        }
        else
        {
            first.previous=newLink;  //newlink<-- old first
        }
        newLink.next=first;
        first=newLink;
    }
    public void insertLast(long dd) //insert at end of list
    {
        Link newLink=new Link(dd);
        if (isEmpty())
        {
            first=newLink; //newlink<-- first
        }
        else
        {
            last.next=newLink;
            newLink.previous=last;
        }
        last=newLink;
    }
    public Link deleteFirst()
    {
        Link temp=first;
        if(first.next==null)
        {
            last=null;
        }
        else
        {
            first.next.previous=null;
        }
        first=first.next;
        return temp;
    }
    public Link deleteLast()
    {
        Link temp=last;
        if(first.next==null)
        {
            first=null;
        }
        else
        {
            last.previous.next=null;
        }
        return temp;
    }
    public boolean insertAfter(long key,long dd) //insert dd after key
    {
        Link current=first;
        Link newLink=new Link(dd);
        while (current.dData!=key)
        {
            current = current.next;
            if (current == null)
            {
                return false; // did not find it
            }
        }

            if (current==last)
            {
                newLink.next=null;
                last=newLink;
            }
            else
            {
                newLink.next=current.next;
                current.next.previous=newLink;
            }
        newLink.previous=current;
        current.next=newLink;
        return true;
    }

}
