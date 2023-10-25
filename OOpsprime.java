public class OOpsprime
{}
class EDG
{
    void primenum(int num)
    {
        if(num%2==0)
        {
            System.out.println(num + " is not Prime Number");
        }
        else
        {
            System.out.println(num+ " is Prime Number ");
        }
    }
}
class KLM
{
    public static void main(String[] args)
    {
        EDG sc=new EDG();
        sc.primenum(6);

    }
}
