/*This is a program that will convert the amount of seconds input by the user
to minutes. the user will enter any amount of seconds and the program will
divide it to 60 seconds and will inout the minutes value in the following format:
00:00.
the program is written by Natalie Mulodjanov*/
import java.util.*;// importing java packages
import java.lang.*;


public class SecondsConverter{
  public static void main(String[] args) {

    int seconds;
    int minutes;
    int rest;
    Scanner input = new Scanner(System.in);// imported from Scanner class

    System.out.println("\n\n\n*****SecondsConverter******\n\n\n");

    System.out.println("Please enter the amount of seconds you'd like to" +
                        " convert here: ");// user input
    seconds = input.nextInt();

    minutes = seconds / 60;
    rest = seconds % 60;
    System.out.println("The seconds you have entered equal to ");
    System.out.println(minutes + ":" + rest + " minutes" );
 }
}
