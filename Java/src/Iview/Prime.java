package Iview;
import java.util.*;

public class Prime
{
    public static void main(String[] args)
    {
            System.out.println("\nEnter the limit");
            int limit=new Scanner(System.in).nextInt();
            System.out.println("\nPrinting prime numbers from 1 to \t"+limit);
            for (int i=2;i<=limit;i++)
            {
                if(isPrime(i))
                {
                    System.out.println("\nPrimeNumber is\t"+i);
                }
            }
    }
    public static boolean isPrime(int param)
    {
        for(int i=2;i<param;i++)
        {
            if (param%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
