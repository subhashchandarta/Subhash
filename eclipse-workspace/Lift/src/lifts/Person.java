package lifts;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press floor number 1 or 2");
		int selectfloor = sc.nextInt();
		Lift lt = Operator.operation(selectfloor);
		if (lt !=null)
		{
			lt.travel();
		}
		else 
		{
			System.out.println("Invalid operation");
		}
		sc.close();
	}

}
