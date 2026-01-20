package Personnages;

public abstract class Personnage {

	private String nom;
	private int force;

	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getnom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + this.getnom() + ": << " + texte + " >>.");
	}

	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force < 1) {
			force = 0;
			System.out.println("j'abandonne");

		} else {
			System.out.println("Aie");
		}
	}

	public void frapper(Personnage personnage) {
		System.out.println(donnerAuteur() + nom + " envoie un grand coup dans la mâchoire au " + donnerAuteur()
				+ personnage.getnom());
		personnage.recevoirCoup(force / 3);
	}

	protected abstract String donnerAuteur();

}