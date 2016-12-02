
public class TestGeraete {

	public static void main(String[] args) {

		Laserdrucker l1 = new Laserdrucker();
		Laserdrucker l2 = new Laserdrucker();
		Faxgeraet f1 = new Faxgeraet();
		Faxgeraet f2 = new Faxgeraet();
		Kombigeraet k1 = new Kombigeraet();
		Kombigeraet k2 = new Kombigeraet();
		f1.senden ("Dies ist ein Test");System.out.println("---------------------");
		f2.senden ("Dies ist ein Test");System.out.println("---------------------");
		l1.drucken ("Dies ist ein Test");System.out.println("---------------------");
		l2.drucken ("Dies ist ein Test");System.out.println("---------------------");
		k1.senden ("Dies ist ein Test");System.out.println("---------------------");
		k2.senden ("Dies ist ein Test");System.out.println("---------------------");
		k1.drucken ("Dies ist ein Test");System.out.println("---------------------");
		k2.drucken ("Dies ist ein Test");System.out.println("---------------------");
	}
	

}
