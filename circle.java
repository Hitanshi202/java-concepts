import java.util.Scanner;

public class circle
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius of circle");
         float r= sc.nextFloat();
        double area= 3.14 * r* r;
        float diameter =2*r;
        double circumference=2*3.14*r;
        System.out.println("area of the circle" +area);
        System.out.println("diameter of the circle" +diameter);
        System.out.println("circumferenceof the circle" +circumference);
    }
}
