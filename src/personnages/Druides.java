package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druides extends Gaulois {
	private Random random;
	private int nombreDeDose;
	private int forcePotion;

	public Druides(String nom, int force, int nombreDeDose) {
		super(nom, force);

		try {
			random = SecureRandom.getInstanceStrong();

		} catch (Exception e) {
			e.printStackTrace();

		}
		forcePotion = random.nextInt(2, 7);

		this.nombreDeDose = nombreDeDose;

		this.parler(
				"J'ai concocté " + nombreDeDose + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public int getNombreDeDose() {
		return nombreDeDose;
	}

	public void boosterGaulois(Gaulois gaulois) {
		if (gaulois.getnom().equals("Obelix")) {
			this.parler("Non, Obelix Non !... Et tu le sais très bien ! ");
		} else {
			if (nombreDeDose > 0) {
				nombreDeDose--;
				gaulois.boirePotion(forcePotion);
				this.parler("Tiens " + gaulois.getnom() + " un peu de potion magique.");
			} else {
				this.parler("Désolé " + gaulois.getnom() + " il n'y a plus une seule goutte de potion.");
			}

		}

	}
}
