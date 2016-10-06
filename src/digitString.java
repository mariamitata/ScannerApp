import java.util.Scanner;

public class digitString {
public static void main(String[] args) {
    String[] one = {"one", "two", "three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen"};
    String[] tens = {"twenty", "thirty", "fourty", "fifty", "sixsty","seventy","eighty","ninty"};
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter number here : ");
    int num = keyboard.nextInt();
	if(num<20){
		System.out.println(one[num-1]);
	}else{
	String number = String.valueOf(num);
	for(int i = 0; i < number.length(); i++) {
	    int j = Character.digit(number.charAt(i), 10);
	    
	    if(i==0){
	    	  System.out.print( tens[j-2] + " ");
	    }else if(i==1){
	    	System.out.print(one[j-1]);
	    }
	    
	    
	}
}
}
}
