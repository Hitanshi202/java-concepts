public class Fibonacci
{
    public static void main(String[] args)
    {
        int n=6;
        int num1=1;
        int num2=2;
        for (int i=1;i<=n;i++)
        {
            System.out.println(num1);
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }

    }
}
