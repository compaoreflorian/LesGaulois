package personnages;

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

	public int getforce() {
		return force;
	}

	public void setforce(int force) {
		this.force = force;
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
	
	protected int calculForceCoup() {
		return force;
	}

	public void frapper(Personnage personnage) {
		if (personnage.force < 1) {
			System.out.println("Le " + personnage.donnerAuteur()+ " " + personnage.getnom() + " est déja a terre.");
		} else {
			personnage.recevoirCoup(calculForceCoup());
			System.out.println("Le " + donnerAuteur()+" " + nom + " envoie un grand coup dans la mâchoire de force " + calculForceCoup() + " au "
					+ personnage.donnerAuteur() + personnage.getnom());
		}
	}

	

	protected abstract String donnerAuteur();

}