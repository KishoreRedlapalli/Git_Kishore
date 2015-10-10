package Iview.SQ_Gen1;


public class Qgen<E>
{
    private Node<E> first,last;

    void enQ(E item)
    {
        if(first==null)
        {
            last=new Node<E>(item);
            last=first;
        }
        else
        {
            last.nextLink=new Node<E>(item);
            last=last.nextLink;
        }
    }
    public E deQ()
    {
        if(first!=null)
        {
            E item=first.data;
            first=first.nextLink;
            return item;
        }
        return null;
    }
}
