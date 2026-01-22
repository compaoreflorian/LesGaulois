package sites;

import personnages.*;

public class Camp {
	private Soldat commandant;
	private int nb_soldats = 0;
	private Soldat[] soldats = new Soldat[80];

	public Camp(Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("je suis en charge de créer un nouveau camp romain");
	}

	public Soldat getcommandant() {
		return commandant;
	}

	public void ajouterSoldat(Soldat soldat) {
		if (nb_soldats < 80) {
			soldats[nb_soldats] = soldat;
			soldat.parler("je met mon épée au service de Rome dans le camp dirigé par " + commandant.getnom());
			nb_soldats += 1;
		}

		else {
			System.out.println("votre camp est rempli");
		}

	}

	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + commandant.getnom() + " contient les soldats : ");
		for (int i = 0; i < nb_soldats; i++) {
			System.out.println(soldats[i].getnom());
		}
	}
	
	public void changerCommandant(Soldat soldat) {
		if(soldat.getGrade() == Grade.CENTURION) {
			soldat.parler("Moi " + soldat.getnom() + "je prends la direction du camp romain.");
			this.commandant=soldat;
		}
		else {
			soldat.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
		}
	}
}
