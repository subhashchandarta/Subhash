package elevator;

import java.util.Scanner;

public class Elevator2customer {

	public static void main(String[] args) {
		
		Elevator2operation e2 = new Elevator2operation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Elevator No:2 -> Enter 3 or 4");
		int selectfloor = sc.nextInt();
		Elevator ev2 = e2.e2operation(selectfloor);
		if (ev2 == null)
		{
			System.out.println("Invalid input");
		}
		else
		{
			if( ev2 instanceof Floor3)
			{
				System.out.println("You reached third floor");
			}
			else if(ev2 instanceof Floor4)
			{
				System.out.println("You reached fourth floor");
			}
		}
		sc.close();
	}
}
