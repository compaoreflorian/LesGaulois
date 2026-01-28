package test_fonctionnel;

import sites.*;
import personnages.*;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Axtérix", 2);
		Soldat minus = new Soldat("minus", 15, Grade.SOLDAT);
		minus.equiper(Equipement.BOUCLIER);
		minus.equiper(Equipement.CASQUE);
		minus.equiper(Equipement.PLASTRON);
		Druides panoramix = new Druides("Panoramix", 2, 3);
		Gaulois Obelix = new Gaulois("Obelix", 15);
		Gaulois Assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois Agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois Abaracourix = new Gaulois("Abaracourix", 2);
		panoramix.boosterGaulois(asterix);
		panoramix.boosterGaulois(Obelix);
		panoramix.boosterGaulois(Assurancetourix);
		panoramix.boosterGaulois(Abaracourix);
		panoramix.boosterGaulois(Agecanonix);
		asterix.parler("bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");

		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
	}

}
