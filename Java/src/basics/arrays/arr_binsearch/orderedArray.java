package basics.arrays.arr_binsearch;

class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;//foundit, in the middle
            } else if (lowerBound > upperBound) {
                return nElems;//cannot find
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;//in lowerhalf
                } else {
                    upperBound = curIn - 1;//in uppper half
                }
            }
        }
    }

    public void insert(long value) {
        int j;//temp variable
        for (j = 0; j < nElems; j++)//find where it goes,linear search
        {
            if (a[j] > value)
                break;
            for (int k = nElems; k > j; k--)
                a[k] = a[k - 1];
            a[j] = value;//insert it
            nElems++;
        }
    }

    public void delete(long value)
    {

    }
}
