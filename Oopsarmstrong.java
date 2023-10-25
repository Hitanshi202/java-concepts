import java.util.Scanner;
public class Oopsarmstrong
{

    static boolean isArmstrong(int number)
    {
            int sum = 0;
            int originalNumber = number;
            int numberOfDigits = 0;

            while (originalNumber > 0) {
                numberOfDigits++;
                originalNumber /= 10;
            }

            originalNumber = number;
            while (originalNumber > 0) {
                int remainder = originalNumber % 10;
                sum += Math.pow(remainder, numberOfDigits);
                originalNumber /= 10;
            }

            return sum == number;
        }

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number to check if it is an Armstrong number: ");
            int number = scanner.nextInt();

            if (isArmstrong(number))
            {
                System.out.println(number + " is an Armstrong number.");
            } else
            {
                System.out.println(number + " is not an Armstrong number.");
            }

            scanner.close();
        }
}

