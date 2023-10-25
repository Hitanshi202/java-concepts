public class votingsystem
{
    public static void main(String[] args)
    {
     String citizen="Indian";
     int age=21;
     if(citizen.equals("Indian") || citizen.equals("indian"))
     {
         if (age > 18 && age < 100)
         {
             System.out.println("eligible to vote");
         }
         else if (age > 100 || age < 1)
         {
             System.err.println("invalid age");
         }
         else
         {
             System.out.println("you are minor,not eligible to vote");
         }
     }
     else
         {
             System.out.println("not a citizen of india,not eligible to vote");
         }
     }

    }

