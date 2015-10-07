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
}
