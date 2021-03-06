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
        Node newNode=new Node();
        newNode.iData=id;
        newNode.fdata=dd;
        //testcomment
        if (root==null)
        {
            root=newNode;
        }
        else
        {
            Node current=root;
            Node parent;
            while(true)
            {
                parent=current;
                if(id<current.iData) //goLeft
                {
                    current=current.leftChild;
                    if(current==null)
                    {
                        parent.leftChild=newNode;
                        return;
                    }
                }//end goLeft
                else //goRight
                {
                    current=current.rightChild;
                    if(current==null)
                    {
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }
    }
    public void inOrder(Node localRoot)
    {
        if(localRoot!=null)
        {
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.iData+"\t");
            inOrder(localRoot.rightChild);
        }
    }
    public Node minimum()
    {
        Node current,last=null;
        current=root;
        while(current!=null)
        {
            last=current;
            current=current.leftChild;
        }
        return last;
    }
    public Node maximum()
    {
        Node current,first=null;
        current=root;
        while(current!=null)
        {
            first=current;
            current=current.rightChild;
        }
        return first;
    }

    public boolean delete(int key) //deleting leafnode
    {
        Node current=root;
        Node parent=root;
        boolean isLeftChild=true;
        while (current.iData!=key) //search for node
        {
            parent=current;
            if (key<current.iData)
            {
                isLeftChild=true;
                current=current.leftChild;
            }
            else
            {
                isLeftChild=false;
                current=current.rightChild;
            }
            if (current==null)
            {
                return false;
            }
            if (current.leftChild==null && current.rightChild==null)//root to be deleted, to be xplored
            {
                if (current==root)
                {
                    root=null;
                }
                else if(isLeftChild)
                {
                    parent.leftChild=null;
                }
                else
                {
                    parent.rightChild=null;
                }
            }
            //code to Delete a Node with One Child


        }
        return true;
    }
}
