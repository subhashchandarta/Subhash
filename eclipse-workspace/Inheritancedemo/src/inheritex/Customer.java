package inheritex;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		System.out.println("Enter beverage you want: Tea or Coffee or Milk");
		Scanner sc = new Scanner(System.in);
		String beveragetype = sc.nextLine();
		System.out.println("Customer asked for -> " + beveragetype);
		Beverage bvg = Vendingmachine.getbeverage(beveragetype);
		if(bvg !=null)
		{
			bvg.drink();
		}
		else
		{
			System.out.println("Product not available");
		}
		sc.close();
	}

}
