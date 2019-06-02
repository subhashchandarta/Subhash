package elevator;

public class Elevator1operation {
	
	Elevator1 e1operation(int selectfloor)
	{
		switch(selectfloor)
		{
		case 1:
			return new Floor1();
		case 2:
			return new Floor2();
		default:
			return null;
		}
	}
}
