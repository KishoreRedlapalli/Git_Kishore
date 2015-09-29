package hacker_rank_submissions.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by kredlapa on 9/29/2015.
 */
public class simple_array_sum
{
    public static void main(String[] args)
    {
        int limit=0,sum=0;
        int inptnum;
        Scanner scan=new Scanner(System.in);
        limit = scan.nextInt();
        for (int i=0;i<limit;i++)
        {
            inptnum=scan.nextInt();
            sum+=inptnum;
        }
        System.out.println(sum);
    }
}
