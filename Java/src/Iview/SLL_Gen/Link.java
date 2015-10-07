package Iview.SLL_Gen;


public class Link<E>
{

    E data1;

    public Link nextLink;

    public Link(E d)
    {

             this.data1=d;

    }

    public void printLink()
    {

        System.out.println("\n"+data1);

    }

}
