import java.util.Scanner;

public class TemperatureDemo
{
   public static void main(String args[])
   {
   // Declare variables
      double degrees;
      Temperature temperature1 = new Temperature();
      Temperature temperature2 = new Temperature();

   // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);

   // Get the first temperature in Celsius from the user
      System.out.print("Enter a temperature in Celsius: ");
      degrees = keyboard.nextDouble();
      temperature1.setDegreesFromCelsius(degrees);

   // Display the first temperature in Kelvin
      System.out.println("Temperature 1 is " + temperature1.getDegreesInKelvin() 
                          + " degrees Kelvin");

   // Get the second temperature in Fahrenheit from the user
      // You figure out this code

   // Display the second temperature in Kelvin
      // You figure out this code
   }
}
