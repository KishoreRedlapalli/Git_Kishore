package Iview.SLL_Gen;


public class LinkListTest
{
    public static void main(String[] args)
    {
        LinkList<String> LL_Var=new LinkList<String>();
        LL_Var.Add("Item1");
        LL_Var.Add("Item2");
        LL_Var.Add("Item3");
        LL_Var.printList();

        LL_Var.remove("Item1");
        LL_Var.printList();

    }
}
