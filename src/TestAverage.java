import java.util.Scanner;

public class TestAverage
{
	public static void main(String a[])
	{
		double testScore1;
        double testScore2;
        double testScore3;
        double average;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first test score: ");
        testScore1 = keyboard.nextDouble();
        
        System.out.println("Enter your second test score: ");
        testScore2 = keyboard.nextDouble();
        
        System.out.println("Enter your third test score: ");
        testScore3 = keyboard.nextDouble();
        
        average = (testScore1 + testScore2 + testScore3) / 3.0;
        
        System.out.println("Your average score is: " + average);
        System.exit(0);
        keyboard.close();
	}
}
