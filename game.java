import java.util.Scanner;

public class game
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter userchoice: 'rock','paper','scissor',");
        String userchoice=sc.next();
        System.out.println("Enter computerchoice:'rock','paper','scissor',");
        String computerchoice=sc.next();
        if(userchoice.equals(computerchoice))
        {
            System.out.println("Tie");
        }
        else if(userchoice.equals("rock") && computerchoice.equals("scissor"))
        {
            System.out.println("userchoice wins");
        }
        else if(userchoice.equals("rock") && computerchoice.equals("paper"))
        {
            System.out.println("computerchoice wins");
        }
        else if(userchoice.equals("paper") && computerchoice.equals("scissor"))
        {
            System.out.println("computerchoice wins");
        }
        else if(userchoice.equals("scissor") && computerchoice.equals("rock"))
        {
            System.out.println("computerchoice wins");
        }
        else  if (userchoice.equals("paper") && computerchoice.equals("rock"))
        {
            System.out.println("userchoice wins");
        }
        else if(userchoice.equals("scissor") && computerchoice.equals("paper"))
        {
            System.out.println("userchoice wins");
        }
        else
        {
            System.out.println("invalid choice ");
        }





    }
}
