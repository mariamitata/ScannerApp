import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your String");
		String userString = keyboard.nextLine();

		System.out.println(reverseString(userString));

		
		
		
	}

	public static String reverseString(String uString) {
		String reverse = "";
		int length = uString.length();
		for (int i = length - 1; i >= 0; i++)
			reverse = reverse + uString.charAt(i);
		System.out.println(reverse);
		return reverse;
		
	}
}
