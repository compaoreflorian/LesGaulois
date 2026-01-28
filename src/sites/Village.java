package sites;

import personnages.*;

public class Village {
	private Gaulois chef;
	private int nb_gaulois = 0;
	private Gaulois[] villagois = new Gaulois[4];

	public Village(Gaulois chef) {
		this.chef = chef;
		chef.parler("je suis un grand guerrier et je vais créer mon village");
	}

	public Gaulois getchef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois villagoi) {
		if (nb_gaulois < 4) {
			villagois[nb_gaulois] = villagoi;
			chef.parler("Bienvenue " + villagoi.getnom() + " !");
			nb_gaulois ++;
		}

		else {
			chef.parler("Désolé " + villagoi.getnom() + " mon village est déjà bien rempli.");
		}
	}

	public void afficherVillageois() {
		System.out.println("Le village de " + chef.getnom() + " est habité par : ");
		for (int i = 0; i < nb_gaulois; i++) {
			System.out.println(villagois[i].getnom());
		}
	}

	public void changerChef(Gaulois gauloi) {
		chef.parler("Je laisse mon grand bouclier au grand " + gauloi.getnom());
		gauloi.parler("merci ! ");
		this.chef = gauloi;
	}
}
