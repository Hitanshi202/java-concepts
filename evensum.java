import java.util.Scanner;
public class evensum
{
            public static void main(String[] args)
            {
                Scanner scanner = new Scanner(System.in);

                int even = 0;
                int odd = 1;

                System.out.println("Please enter 10 digits:");
                for (int i = 0; i <= 10; i++)
                {
                    int num = scanner.nextInt();
                    if (num % 2 == 0)
                    {
                        even += num;
                    } else
                    {
                        odd *= num;
                    }
                }

                System.out.println("Sum of even numbers: " + even);
                System.out.println("Product of odd numbers: " + odd);


            }
        }


