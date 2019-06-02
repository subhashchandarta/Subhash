package elevator;

public class Elevator2operation {
	
	Elevator2 e2operation(int selectfloor)
	{
		switch(selectfloor)
		{
		case 3:
			return new Floor3();
		case 4:
			return new Floor4();
		default:
			return null;
		}
	}
}
