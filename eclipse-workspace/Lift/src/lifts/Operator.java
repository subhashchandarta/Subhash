package lifts;

public class Operator {
	
	public static Lift operation(int selectfloor)
	{
		Lift li = null;
		switch(selectfloor)
		{
		case 1:
			li = new Floor1();
			break;
		case 2:
			li = new Floor2();
			break;
		/*default:
			System.out.println("Invalid input");*/
		}
		return li;
	}
}
