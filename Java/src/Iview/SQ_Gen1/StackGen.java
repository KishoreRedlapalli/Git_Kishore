package Iview.SQ_Gen1;


public class StackGen<E>
{

    private Node<E> top;
    public void push(E item)
    {
        Node t=new Node<E>(item);
        t.nextLink=top;
        top=t;
    }
    public E pop()
    {
        if(top!=null)
        {
            E item = top.data;
            top = top.nextLink;
             return item;
         }
        return null;
    }




}
