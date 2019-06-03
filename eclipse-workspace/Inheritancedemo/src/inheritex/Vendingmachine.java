package inheritex;

public class Vendingmachine {

	public static Beverage getbeverage(String beveragetype)
	{
		Beverage b = null;
		if(beveragetype.equalsIgnoreCase("Tea"))
		{
			b = new Tea();
		}
		
		else if(beveragetype.equalsIgnoreCase("Coffee"))
		{
			b = new Coffee();
		}
		
		else if(beveragetype.equalsIgnoreCase("Milk"))
		{
			b = new Milk();
		}
		
		return b;
	}
}