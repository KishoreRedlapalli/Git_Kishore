package Iview.SQ_Gen1;


public class Node<E>
{
    public Node<E> nextLink;
    E data;

    Node(E d)
    {
        this.data=d;
    }

    public void printList()
    {

        System.out.println("\n"+data);
    }
}
