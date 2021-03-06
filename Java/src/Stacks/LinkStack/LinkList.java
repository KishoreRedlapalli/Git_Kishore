package Stacks.LinkStack;


public class LinkList {

    private Link first;

    public void LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long ll) {
        Link newLink = new Link(ll);
        newLink.next = first;
        first = newLink;
    }
    public long deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp.lData;
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
}
