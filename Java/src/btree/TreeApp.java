package btree;

/**
 * Created by kredlapa on 10/28/2015.
 */
public class TreeApp
{
    public static void main(String[] args)
    {
        Tree theTree=new Tree();
        theTree.insert(25,1);
        theTree.insert(34,6);
        theTree.insert(23,4);

        Node found=theTree.find(25);

        if(found!=null)
        {
            System.out.println("Found node with key 25");
        }
        else
        {
            System.out.println("Did not find node with key 25");
        }
    }
}
