
public class Faxgeraet implements Fax{
	private static int count =1 ;

	@Override
	public void senden(String sendeRef) {

		System.out.println("Absender ist: " + Fax.class.getSimpleName() + count++);
		System.out.println(faxsimulation);
		System.out.println(sendeRef);
	}

}
