package Iview.StringRev;
public class StringRev
{
    public static void main(String[] args)
    {
        String orig_string=args[0];
        String reversed_string=" ";
        StringRev stringRev=new StringRev();

        if (args[0].length()!=0)
        {
            reversed_string=stringRev.revers(args[0]);
        }
        else
        {
            System.out.println("Nothing Supplied");
        }
        if (reversed_string.equalsIgnoreCase(orig_string))
        {
            System.out.println("\n Original String is\t"+orig_string+"\tReversed String is \t"+reversed_string+"\tPalindrome, yeah!");
        }
        else
        {
            System.out.println("\n Original String is\t"+orig_string+"\tReversed String is \t"+reversed_string);
        }
    }

     public String  revers(String str)
    {
        char c=str.charAt(str.length()-1);
        //System.out.println("\n c 2nd line is "+c);
        if(str.length()==1)
        {

            return str;

        }
        else
        {
                System.out.println("\n  "+str.substring(0,str.length()-1));
                return c+revers(str.substring(0,str.length()-1));

        }
    }
}
