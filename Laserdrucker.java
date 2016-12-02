package hausaufgabe81;

public class Laserdrucker implements Drucker{
	private static int count =1 ;

	@Override
	public void drucken(String druckRef) {
		System.out.println("Drucker Laser" + count++ +" meldet sich");
		System.out.println(drucksimulation);
		System.out.println(druckRef);

		
	}

}
