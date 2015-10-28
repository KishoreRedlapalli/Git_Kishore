package btree;

/**
 * Created by kredlapa on 10/28/2015.
 */
public class Tree
{
    private Node root;

    public Node find(int key)
    {
        Node current=root;

        while(current.iData!=key)
        {
            if (key<current.iData)
            {
                current=current.leftChild;
            }
            else
            {
                current=current.rightChild;
            }
            if (current==null)
            {
                return null;
            }

        }
        return current;
    }

    public void insert(int id,float dd)
    {

    }
    public void delete(int id)
    {

    }
}
