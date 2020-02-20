/*This program will prompt the user to input the temperature in celsius for
three different days and will output the average temperature in celsius for the
three days.
The program is written by Natalie Mulodjanov*/
import java.lang.*;// importing java packages
import java.util.*;

public class AverageTemp{
  public static void main(String[] args) {

  System.out.println("\n\n\n*****Averag Temparture******\n\n\n");

  double tempC1;
  double tempC2;
  double tempC3;
  double averageTempC;
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter the Temparture in celsius in the first day here: ");
  tempC1 = input.nextDouble();

  System.out.println("Please enter the Temperature in celsius of the second day here: ");
  tempC2 = input.nextDouble();
  System.out.println("Please enter the temperature in celsius of the third day here: ");
  tempC3 = input.nextDouble();

  averageTempC = (tempC1 + tempC2 + tempC3) / 3;

  System.out.printf("The average temperature for the past 3 days is:%.2f ", averageTempC);
 }
}
