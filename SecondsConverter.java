/*This is a program that will convert the input of seconds into minutes.
the method used in this program is imported from the Duration class.
the user input is in seconds and the output is in minutes. the method is
deviding the seconds by 60s to get the amount of minutes.
the program is written by Natalie Mulodjanov*/
import java.util.*;// importing java packages
import java.lang.*;
import java.time.*;

public class SecondsConverter{
  public static void main(String[] args) {

    int seconds;
    int minutes;
    Scanner input = new Scanner(System.in);// imported from Scanner class

    System.out.println("\n\n\n*****SecondsConverter******\n\n\n");

    System.out.println("Please enter the amount of seonds you'd like to" +
                        " convert here: ");// user input
    seconds = input.nextInt();

    minutes = Duration.toMinutes(seconds);// method from Duration class

    System.out.println(seconds + "seconds are" + minutes + " minutes");
  }
}
