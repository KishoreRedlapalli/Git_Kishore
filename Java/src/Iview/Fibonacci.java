package Iview;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 4/9/13
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("\nEnter the limit upto which the fib series has to be printed\n");
        int limit=new Scanner(System.in).nextInt();
        for (int i=1;i<=limit;i++)
        {
            System.out.println("\n"+fibonacci(i));
        }
    }
    public static int  fibonacci(int number)
    {
        int fib1=1;
        int fib2=1;
        int fibonacci=3;
        if(number ==1 || number==2 )
        {
            return 1;
        }
        for(int i=3;i<=number;i++)
        {
            fibonacci=fib1+fib2;
            fib1=fib2;
            fib2=fibonacci;
        }
        return fibonacci;
    }
}
