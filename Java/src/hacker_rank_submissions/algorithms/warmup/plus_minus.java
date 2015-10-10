package hacker_rank_submissions.algorithms.warmup;
import java.util.Scanner;

/**
 * Created by kredlapa on 9/29/2015.
 */
public class plus_minus
{
    public static void main(String[] args)
    {
        int positive=0,negative=0,zero=0;
        float float_positive=0,float_negative=0,float_zero=0;
        Scanner s=new Scanner(System.in);
        System.out.println("in main");
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]>0)
            {
                positive++;
            }
            else if(arr[i]<0)
            {
                negative++;
            }
        }
        float_zero=(zero/(float)n);
        float_positive=(positive/(float)n);
        float_negative=(negative/(float)n);
        System.out.printf("%.3f",float_positive);
        System.out.printf("%.3f", float_negative);
        System.out.printf("%.3f",float_zero);
    }
}
