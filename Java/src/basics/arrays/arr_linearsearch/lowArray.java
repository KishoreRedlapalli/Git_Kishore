package basics.arrays.arr_linearsearch;

public class lowArray {
    private long[] longArrayTest; //reference to array

    public lowArray(int size) {
        longArrayTest = new long[size];
    }

    public void setLongArrayTest(int index, long value) {
        longArrayTest[index] = value;
    }

    public long getElement(int index) {
        return longArrayTest[index];
    }
}

