import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter first number: ");
        int s = sc.nextInt();
        int x =sc.nextInt();
        int z= sc.nextInt();
        int b = sc.nextInt();
        int d =sc.nextInt();
        System.out.println("Enter second number: ");
        int s1 =sc.nextInt();
        int y =sc.nextInt();
        int a =sc.nextInt();
        int bb= sc.nextInt();
        int dd= sc.nextInt();
        int sum= s+s1;
        int difference = x-y;
        int product = z*a;
        int quotient= b/bb;
        int divisor = d%dd;
        System.out.println("the sum of the number is:" +sum);
        System.out.println("the difference of the number is:" + difference);
        System.out.println("the product of the number is:" +product);
        System.out.println("the quotient of the number is:" +quotient);
        System.out.println("the divisor of the number is:" +divisor);
    }

}
