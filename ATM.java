import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("*** ATM Machine ***"+  "\n");
        System.out.println("Press 1 to check balance,2 to withdraw,3 to deposit ");
        int choice= sc.nextInt();
        int balance=15000;
        float deposit,withdraw;
        if(choice==1)
        {
            System.out.println("Your Current Balance is:" + balance);
        }
        else if(choice==2)
        {
            System.out.println("Enter the Amount you want to Withhdraw: ");
            withdraw = sc.nextFloat();
            System.out.println("Your Current Balance is:" + (balance-withdraw));
        }
        else if(choice==3)
        {
            System.out.println("Enter the amount you want to deposit: ");
            deposit = sc.nextFloat();
            System.out.println("Your Current balance is: " + (balance+deposit));
        }
        else
        {
            System.out.println("invalid input");
        }

    }
}
