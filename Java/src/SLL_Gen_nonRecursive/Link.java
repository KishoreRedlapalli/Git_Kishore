package SLL_Gen_nonRecursive;

/**
 * Created by KishoreRP on 10/18/2015.
 */
public class Link<E>
{
    E carname;
    E carmake;
    public Link nextLink;
    public Link(E name,E make)
    {
        this.carname=name;
        this.carmake=make;
    }
    public void printLink()
    {
        System.out.println(" carname\t"+carname+"\tcarmake\t"+carmake);
    }

}
