package basics.arrays.arr_linearsearch;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: KishoreRP
 * Date: 3/26/14
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class abstractionArray_linearops {
    private long[] arr;
    private int nElems;

    public abstractionArray_linearops(int max) {
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
    public void removedups()
    {
        System.out.println("in remove dups method");
        int j=0;
        int i=1;
        for(i=1;i<nElems;i++)
        {
            if (arr[i]==arr[i+1])
            {
                i++;
            }
            else
            {
                j++;
                arr[j]=arr[i];
                i++;

            }
        }
        long[] nodupsarray= Arrays.copyOf(arr,j+1);
        for (int i1=0;i1<nodupsarray.length;i1++)
        {
            System.out.println(nodupsarray[i1]+"\t");
        }
    }

    public void countunique()
    {
        System.out.println("in count unique method");
        int count=0;
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]==arr[i+1])
            {
                count++;
            }
        }
        System.out.println("Count of Unique elements is "+(arr.length-count));
    }

}
class HighArrayApp
{
    public static void main(String[] args)
    {
        int maxSize=20;
        abstractionArray_linearops arr;
        arr =new abstractionArray_linearops(maxSize);

        arr.insert(100);
        arr.insert(77);
        arr.insert(1002);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(10055);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(1002);

        //arr.display();
        arr.getmax();
        arr.countunique();
        arr.removedups();


    }
}