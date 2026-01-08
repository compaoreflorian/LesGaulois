package LesGaulois;

import Personnages.Romain;

public class Gaulois {
	private String nom;

	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getnom() {
		return nom;
	}

	public void parler(String text) {
		System.out.println("Le gaulois " + this.getnom() + ": << " + text + " >>.");
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getnom());
		romain.recevoirCoup(force / 3);
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Axtérix", 8);
		System.out.println(asterix.getnom());
	}
}
