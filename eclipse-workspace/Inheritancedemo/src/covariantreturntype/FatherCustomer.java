package covariantreturntype;

import java.util.Scanner;

public class FatherCustomer {

	public static void main(String[] args) {
		
		FatherHotel f = new FatherHotel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice..\n 1. Chole Batura..\n 2. Puri Sabji"
				+ "\n 3. Idly \n 4. Upma");
		int choice = sc.nextInt();
		VegFood vf = f.serve(choice);
		if (vf == null) 
		{
			System.out.println("Item not available");
		} 
		else 
		{
			if (vf instanceof CholeBatura) 
				{
				System.out.println("Enjoy chole batura !");
				} 
			else if (vf instanceof PuriSabji)
				{
				System.out.println("Enjoy puri sabji !");
				} 
			else if (vf instanceof Idly)
				{
				System.out.println("Enjoy Idly !");
				}
			else if (vf instanceof Upma)
				{
				System.out.println("Enjoy Upma !");
				}
		}
		sc.close();
	}
}

