import java.util.*;

public class MyAgeIs {

  public static void main(String[] args) {
  int currentYear;
  int yearofBirth;
  double myAge;
  Scanner sc = new Scanner(System.in);

  System.out.println("*****AGE CALCULATOR*****");
	 
  System.out.println("Please enter the current year");
	currentYear = sc.nextInt();
  
  System.out.println("Please enter your year of birth");
  yearofBirth = sc.nextInt(); 

  myAge = currentYear - yearofBirth;
  System.out.println ("my current age is:" + myAge);

  }

}
