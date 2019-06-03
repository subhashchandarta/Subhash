package covariantreturntype;

public class SonHotel extends FatherHotel{
	NorthindianFood serve(int choice) {
		switch(choice){
			case 1:
			return new CholeBatura();
			case 2:
			return new PuriSabji();
			default:
			return null;
		}
	}
}
