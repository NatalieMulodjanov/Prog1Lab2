import java.util.*;
public class RectanglePerimeterQ1 {
  public static void main (String[] args){

    double length;
    double width;
    double perimeter;
    double area;
    
    System.out.println("******RECTANGLE PERIMETER AND EREA CALCULATOR******");
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter the length of the rectangle");
    length = sc.nextDouble(); 
    
    System.out.println("Please enter the width");
    width = sc.nextDouble();
 
    perimeter = 2 * (length + width);
    area = length * width;

    System.out.println("rectangle perimeter  " + perimeter +
                        "\nrectangle area " + area);


  }
}
