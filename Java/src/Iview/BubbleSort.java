package Iview;
public class BubbleSort
{
    public static void sort(int[] items)
    {
        int tmp=0;

        for(int i=0;i<items.length;i++)
        {
            for(int j1=i+1;j1<items.length;j1++)
            {
              if(items[i]>items[j1])
                {
                    tmp=items[i];
                    items[i]=items[j1];
                    items[j1]=tmp;
                }
            }
        }
        for (int i=0;i<items.length;i++)
        {
            System.out.println("\n "+items[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] Test_arr={1,4,23,2,45,999,102,1000,2001,0,9};
        BubbleSort.sort(Test_arr);
        System.out.println("\nBubbleSortedArray");
    }

}
