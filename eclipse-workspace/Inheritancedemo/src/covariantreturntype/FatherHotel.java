package covariantreturntype;

public class FatherHotel {
	
	VegFood serve(int choice){
		switch(choice){
			case 1:
			return new CholeBatura();
			case 2:
			return new PuriSabji();
			case 3:
			return new Idly();
			case 4:
			return new Upma();
			default :
			return null;
			
		}
	}
}
