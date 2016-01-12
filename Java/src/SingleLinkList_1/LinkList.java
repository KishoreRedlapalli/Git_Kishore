package SingleLinkList_1;

public class LinkList {

    private Link first;

    public void LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }
    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }
    public void displayList() {
        System.out.println("printing");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("\n");
    }
    public Link find(int key)
    {
        //for finding any element in the list
        Link current=first;
        while(current.iData!=key) {
            if (current.next == null) {
                return null;//dint find it
            } else {
                current = current.next;
            }
        }
        return current;//found it
    }
    public Link delete(int key)
    {
        //for deleting any element in the list
        Link current=first;
        Link previous=first;
        while (current.iData!=key)
        {
            if (current.next==null)
            {
                return null;//did not find it.
            }
            else
            {
                previous=current;//goto next link
                current=current.next;
            }
        }//found
        if(current==first)
        {
            first=first.next;
        }
        else
        {
            previous.next=current.next;
        }
        return current;

    }


}
