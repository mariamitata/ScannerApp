import java.util.Scanner;

public class binarycheck {
		
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your number : ");
		int num = keyboard.nextInt();
		System.out.println(isBinary(num));
	}
	
	public static String isBinary(int number){
		int usernumber = number;
		String checkif;
		while(usernumber!=0){
			if(usernumber%10>1){
				checkif = "Not Binary";
				return checkif;
			}
			usernumber = usernumber / 10;
			
		}
		checkif = "Binary";
		return checkif;
	}
}
