package Iview.SLL_Gen;

import java.util.*;

public class LinkList<E>
{

    private Link<E> first=null;

    /*public LinkList()
    {
        first=null;
    }*/

    private boolean Add(E data,Link<E> node)
    {
        if(node==null)
        {

            this.first=new Link<E>(data);
            System.out.println("\nFirst Node added, data being  " + first.data1);
            return true;

        }
        else if(node.nextLink==null)
        {
            node.nextLink=new Link<E>(data);
            System.out.println("\nSubsequent Node being added, data being  "+ node.nextLink.data1);
            return true;
        }
        else
        {
            return Add(data,node.nextLink);
        }
    }

    public boolean Add(E data)
    {

        return Add(data,this.first);

    }

    private Link<E> remove(E data,Link<E> node)
    {
        if(node==null)
        {
            System.out.println("\n Empty or Not found!!");
        }

        else

            if(node.data1.equals(data))
            {
                System.out.println("\nRemoved \t"+node.data1);
                return node.nextLink;
            }

         else
            {
                System.out.println("\n"+node.data1+"does not match, Moving to next \t");
                node.nextLink=remove(data,node.nextLink);

            }
        return node;

    }

    public void remove(E data)
    {

        this.first= remove(data,this.first);

    }

    public void printList()
    {
        Link currentLink = first;
        System.out.print("\n Printing the list:\n ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }


}
