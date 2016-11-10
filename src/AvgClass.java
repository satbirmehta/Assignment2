
import java.util.Scanner;

public class AvgClass {

	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first double value");
		double no1 = sc.nextDouble();
		System.out.println("enter second double value");
		double no2 = sc.nextDouble();
		double avg = (no1 + no2)/2 ;
		System.out.println("avg value is " + avg);		
		
	}

}
