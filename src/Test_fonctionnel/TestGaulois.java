package Test_fonctionnel;

import LesGaulois.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Axtérix",8);
		System.out.println(asterix.getnom());
		asterix.parler("Bonjour à tous");
	}

}
