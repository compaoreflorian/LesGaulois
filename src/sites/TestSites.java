package sites;

import personnages.*;

public class TestSites {
	public static void main(String[] args) {

		Gaulois vecingétorix = new Gaulois("vercigétorix", 5);
		Soldat minus = new Soldat("minus", 2, Grade.CENTURION);
		Village village_gaulois = new Village(vecingétorix);
		Camp camp_romain = new Camp(minus);
		Gaulois Agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois Assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois Astérix = new Gaulois("Astérix", 5);
		Gaulois Obelix = new Gaulois("Obelix", 15);
		Gaulois Prolix = new Gaulois("Prolix", 2);
		Soldat Brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		Soldat Milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat Tullius = new Soldat("Tullius", 2, Grade.TESSERASUS);
		Soldat Ballondebaudru = new Soldat("Ballondebaudru", 5, Grade.OPTIO);
		camp_romain.ajouterSoldat(Brutus);
		camp_romain.ajouterSoldat(Milexcus);
		camp_romain.ajouterSoldat(Tullius);
		village_gaulois.ajouterVillageois(Agecanonix);
		village_gaulois.ajouterVillageois(Assurancetourix);
		village_gaulois.ajouterVillageois(Astérix);
		village_gaulois.ajouterVillageois(Obelix);
		village_gaulois.ajouterVillageois(Prolix);
		camp_romain.afficherCamp();
		village_gaulois.afficherVillageois();
		village_gaulois.changerChef(Assurancetourix);
		Soldat Briseradius = new Soldat("Briseradius", 5, Grade.SOLDAT);
		Soldat Chorus = new Soldat("Chorus", 5, Grade.CENTURION);
		camp_romain.changerCommandant(Briseradius);
		camp_romain.changerCommandant(Chorus);
		
	}

}
