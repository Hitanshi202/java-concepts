public class swapvalues3
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
// Swap the values of a and b using a c variable.
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}


