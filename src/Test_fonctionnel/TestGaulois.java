package Test_fonctionnel;

import Personnages.*;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Axtérix", 8);
		asterix.parler("Bonjour à tous");
		Romain minus = new Romain("minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		for (int i = 0; i < 3; i++) {
			minus.frapper(asterix);
		}
	}

}
