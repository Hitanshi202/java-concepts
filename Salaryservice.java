import java.util.Scanner;

public class Salaryservice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int salary = sc.nextInt();
        System.out.println("year of service");
        int year = sc.nextInt();
        float percentage =30;
        if (year >= 5) ;
        {
            float bonus= percentage*salary/100;
            System.out.println();
        }
    }
}
