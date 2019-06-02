package elevator;

import java.util.Scanner;

public class Elevator1customer {

	public static void main(String[] args) {
		
		Elevator1operation e1 = new Elevator1operation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Elevator No:1 -> Enter 1 or 2");
		int selectfloor = sc.nextInt();
		Elevator1 ev1 = e1.e1operation(selectfloor);
		if (ev1 == null)
		{
			System.out.println("Invalid input");
		}
		else
		{
			if( ev1 instanceof Floor1)
			{
				System.out.println("You reached first floor");
			}
			else if(ev1 instanceof Floor2)
			{
				System.out.println("You reached second floor");
			}
		}
		sc.close();
	}
}
