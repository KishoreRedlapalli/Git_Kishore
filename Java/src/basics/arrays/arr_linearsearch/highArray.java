package basics.arrays.arr_linearsearch;

/**
 * Created with IntelliJ IDEA.
 * User: KishoreRP
 * Date: 3/26/14
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class highArray {
    private long[] arr;
    private int nElems;

    public highArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;
        if (j == nElems)
            return false;
        else
            return true;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }
    public void display()
    {
        for (int i=0;i<nElems;i++)
        {
            System.out.println(arr[i]+"\t");
        }
    }
    public boolean delete(long valToBeDeleted)
    {
        int j;
        for(j=0;j<nElems;j++)
            if(arr[j]==valToBeDeleted)//lookforit
                break;
        if(j==nElems)
            return false;//can't find it
        else
        {
            for(int k=j;k<nElems;k++)
            {
                arr[k]=arr[k+1];
            }
            nElems--;
            return true;
        }//end of delete method
    }
    public void getmax()
    {
        System.out.println("in getmax method");
        long max=arr[0];
        for(int i=0;i<nElems;i++)
        {
            if (arr[i]>=max)
            {
                max=arr[i];
            }
        }
        System.out.println("max element is "+max);
    }
}
class HighArrayApp
{
    public static void main(String[] args)
    {
        int maxSize=100;
        highArray arr;
        arr =new highArray(maxSize);
        arr.insert(100);
        arr.insert(77);
        arr.insert(1002);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(1002);
        arr.insert(10055);
        arr.display();
        arr.getmax();


    }
}