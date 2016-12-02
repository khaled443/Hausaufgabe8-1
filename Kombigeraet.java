
public class Kombigeraet implements Drucker,Fax {
	private static int count1 =1 ;
	private static int count2 =1 ;


	@Override
	public void senden(String sendeRef) {
		System.out.println("Absender ist: " + getClass().getSimpleName() + count1++);
		System.out.println(faxsimulation);
		System.out.println(sendeRef);
	}

	@Override
	public void drucken(String druckRef) {

		System.out.println("Kombigerät " +getClass().getSimpleName() + count2++ +" meldet sich");
		System.out.println(drucksimulation);
		System.out.println(druckRef);
	}

	
}
