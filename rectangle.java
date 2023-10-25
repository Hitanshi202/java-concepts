import java.util.Scanner;

public class rectangle
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter length");
        int x = sc.nextInt();
        System.out.println("enter breadth");
        int y =sc.nextInt();
        int area=x*y;
        int perimeter= 2*(x+y);
        System.out.println("the area of the rectangle is" +area);
        System.out.println("the perimeter of the rectangle is" +perimeter);
    }
}
