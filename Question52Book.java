/*this progrma will convert any given name to a Internet Domain.
the program will prompt the user for any given name and will output the name
as an internet domain name starting with www. and ending with .com.
this program is written */
import java.util.*;//importing java packages
import java.lang.*;

public class Question52Book{
  public static void main(String[] args) {

    System.out.println("\n\n\n******Internet domain coverter******\n\n\n");

    String name;
    String internetDomain;
    Scanner input = new Scanner(System.in);// imported from scanner class

    System.out.println("Please enter the name you want to convert here: ");
    name = input.nextLine();

    name = name.concat(".com");// imported from string class

    System.out.println("Your Internet Domain is: " + "www." + name);
    }
}
