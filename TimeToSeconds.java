import java.util.Scanner;

public class TimeConversionToSecond
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int hours, minutes, seconds;  
      System.out.print("enter hours: ");
      hours = keyboard.nextInt();
      System.out.print("enter minutes: ");
      minutes = keyboard.nextInt();
      System.out.print("enter seconds: ");
      seconds = keyboard.nextInt();
      int totalSeconds = hours*3600 + minutes*60 + seconds;
      System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds is equivalent to " + totalSeconds
                         + " seconds.");
   }
}
