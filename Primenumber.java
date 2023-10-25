public class Primenumber
{
    public static void main(String[] args)
    {
        for(int j = 1; j<101; j++)
        {
            int num = j;
            int x = 0;
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    x++;
                }
            }
            if(x==0)
            {
                System.out.println(j);
            }
            }


    }
}
//num=7;
//for(int i=7)
