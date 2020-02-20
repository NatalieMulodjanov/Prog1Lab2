/*This is  a program that will calculate your BMI by your height, weight and a
BMI formula. the input will be in pounds and feet, then will be converted to
KG and meters. these vaues will then be calculated in a BMI formula.
the program is written by Natalie Mulodjanov  */
import java.util.*;// I am always importing using the * to be safe
import java.lang.*;

public class BMICalculatorQ2{
  public static void main(String[] args) {

    System.out.println("\n\n\n******BMICalcuator******\n\n\n");

    double weight;
    double height;
    double weightKG;
    double heightM;
    double heightPower2;
    double BMI;
    Scanner input = new Scanner(System.in);// Imported from Scanner class

    System.out.println("Please enter your body weight in pounds here: ");// user input
    weight = input.nextDouble();

    System.out.println("Please enter your height in feet here: ");
    height = input.nextDouble();

    weightKG = weight * 0.453592;
    heightM = height * 0.3048;
    heightPower2 = Math.pow(heightM,2);// Methode from Math class
    BMI = weightKG / heightPower2;
    System.out.printf("Your weight in KG is:%.2f\n ", weightKG);
    System.out.printf("Your height in meters is:%.2f\n ", heightM);
    System.out.printf("Your BMI is: %.2f", BMI);
      }
}
