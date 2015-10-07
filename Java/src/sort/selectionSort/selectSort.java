package sort.selectionSort;

/**
 * Created by KishoreRP on 9/19/2015.
 */
class ArraySel {
    private long[] a;
    private int numElements;

    public ArraySel(int max)//constructor
    {
        a = new long[max];//create array
        numElements = 0;//num of elements=0
    }

    public void insert(long value) {
        a[numElements] = value;
        numElements++;
    }

    public void display() {
        for (int j = 0; j < numElements; j++) {
            System.out.println(a[j] + "\t");
        }
        System.out.println("\n");
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < numElements - 1; out++) {
            min = out;
            for (in = out + 1; in < numElements; in++) {
                if (a[in] < a[min]) {
                    min = in;      //a new min
                    swap(out, min);
                }
            }

        }

    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

class selectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySel arr;
        arr = new ArraySel(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(66);
        arr.insert(199);
        arr.insert(9999);
        arr.insert(199);
        arr.insert(9);
        arr.insert(0);
        arr.insert(1);
        arr.insert(2);
        arr.display();
        arr.selectionSort();
        arr.display();


    }
}
