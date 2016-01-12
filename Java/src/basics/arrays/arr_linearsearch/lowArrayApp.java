package basics.arrays.arr_linearsearch;
public class lowArrayApp
{
    public static void main(String[] args)
    {
        lowArray arr;
        arr=new lowArray(100);//make array
        int nElems=0;
        int j;
        arr.setLongArrayTest(0,77);
        arr.setLongArrayTest(1,98);
        arr.setLongArrayTest(2,46);
        arr.setLongArrayTest(3,50);
        arr.setLongArrayTest(4,2);
        arr.setLongArrayTest(5,1);
        arr.setLongArrayTest(6,20);
        arr.setLongArrayTest(7,21);
        arr.setLongArrayTest(8,24);
        arr.setLongArrayTest(9,30);
        nElems=10;
        for (j=0;j<nElems;j++)
        {
            System.out.println(arr.getElement(j)+" ");
        }
        //searching a key
        int searchKey=26;
        for (j=0;j<nElems;j++)
        {
            if (arr.getElement(j)==searchKey)
            {
                break;
            }
        }
        if (j==nElems)
            System.out.println("Cant find " + searchKey);
        else
            System.out.println(searchKey +" Found");

        //delete a key
        for (j=0;j<nElems;j++)
        {
            if (arr.getElement(j)==55)
            {
                break;
            }
        }
        for (int k=j;k<nElems;k++)
        {
            arr.setLongArrayTest(k,arr.getElement(k+1));
        }
        nElems--;
        for (j=0;j<nElems;j++)
        {
            System.out.println(arr.getElement(j)+" ");
        }
    }
}