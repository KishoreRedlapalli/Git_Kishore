package SingleLinkList_1;

/**
 * Created by KishoreRP on 11/16/2014.
 */
public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(1, 2.3);
        theList.insertFirst(2, 4.6);
        theList.insertFirst(3, 6.9);
        theList.displayList();
        /*while (!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();
            System.out.println("deleted");
            aLink.displayLink();
            System.out.println("\n");
        }
        theList.displayList();*/
        theList.displayList();
    }

}
