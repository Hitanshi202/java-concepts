import java.util.Scanner;

public class square
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter side of Square");
        int s=sc.nextInt();
        int area=s*s;
        int perimeter=4*s;
        System.out.println("the area of the square is" +area);
        System.out.println("the perimeter of the square is" +perimeter);
        
    }
}
