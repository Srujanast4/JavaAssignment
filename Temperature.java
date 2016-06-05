 public class Temperature
   {
   // Instance variable
      private double degreesInKelvin; // degrees in Kelvin
   
   // Constructor method: initialize degrees in Kelvin to zero
      public Temperature()
      {
         // you figure out this code
      }
   
   // Convert and save degrees in Celsius in the Kelvin scale
      public void setDegreesFromCelsius(double celsius)
      {
         degreesInKelvin = celsius + 273.15;
      }
      
   // Convert and save degrees in Fahrenheit in the Kelvin scale
      public void setDegreesFromFahrenheit(double fahrenheit)
      {
         // you figure out this code
         // Tip: use floating point division (not integer division)
      }  
   
   // Getter method returns the degrees in Kelvin
      public double getDegreesInKelvin()
      {
		return degreesInKelvin;
         // you figure out this code
      }
   }