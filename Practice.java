import java.util.*;

public class Practice {
	public static void main (String[] args){

		System.out.println("********Scanner Practice**********");

		int age;
		int yearOfBirth = 2020;
		final int CURRENT = 2020;

		Scanner sc = new Scanner(System.in);
		System.out.println("Type the year you were born");
		yearOfBirth = sc.nextInt();
		
		age = CURRENT - yearOfBirth;

		System.out.println("Yout age is " + age);
	}
}