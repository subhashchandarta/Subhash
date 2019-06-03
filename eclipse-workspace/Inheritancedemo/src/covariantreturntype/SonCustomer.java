package covariantreturntype;

import java.util.Scanner;

public class SonCustomer {

	public static void main(String[] args) {
		SonHotel s = new SonHotel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice..\n 1. Chole Batora..\n 2. Poori Sabji");
		int choice = sc.nextInt();
		NorthindianFood vf = s.serve(choice);
		if (vf == null) {
			System.out.println("Item not available");
		} else {
			if (vf instanceof CholeBatura) {
				System.out.println("Enjoy chole batura !!");
			} else if (vf instanceof PuriSabji){
				System.out.println("Enjoy puri sabji  !!");
			} 
		}
		sc.close();
	}
}
