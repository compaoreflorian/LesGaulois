package Test_fonctionnel;

import LesGaulois.Gaulois;
import Personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Axtérix",8);
		System.out.println(asterix.getnom());
		asterix.parler("Bonjour à tous");
		Romain minus = new Romain("minus",6);
		for(int i=0;i<3;i++) {
			//minus.recevoirCoup(3);
			asterix.frapper(minus);
		}
	}

}
