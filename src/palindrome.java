import java.io.*;
import java.util.*;
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String pal;
		System.out.println("Enter some String:");
		Scanner keyboard = new Scanner(System.in);
		pal = keyboard.nextLine();
		ispalindrome(pal);
	}
	
	public static String ispalindrome(String uString){
		String copyString = uString;
		String pal1 = "level";
		String pal2 = "helloworld";
		StringBuffer pal1stringbuff = new StringBuffer(pal1);
		StringBuffer pal2stringbuff = new StringBuffer(pal2);
		
		
		if(copyString.equals(pal1)||copyString.equals(pal1stringbuff.reverse())){
			copyString = "palindrome";
			
		}else if(copyString.equals(pal2)||copyString.equals(pal2stringbuff.reverse())){
			copyString =  "not a palindrome";
		}
		System.out.println(copyString);
		return copyString;
	}
	


}
