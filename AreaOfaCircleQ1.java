//importing java utility package 
import java.util.*;

public class AreaOfaCircleQ1 {
  public static void main(String[] args) {

  	//instantiating objects and declaring variables 
    final double PI = 3.14159;
    double radius;
    double area;
    Scanner sc = new Scanner (System.in);

    //header 
    System.out.println("******AREA OF A CIRCLE CALCULATPOR");
    
    //getting radius from user 
    System.out.println("Please enter the Radius");
	radius = sc.nextDouble();

	//math and calculations 
    area = PI * radius * radius;
    
    //output 
    System.out.println ("The area is " + area );

  }

}
