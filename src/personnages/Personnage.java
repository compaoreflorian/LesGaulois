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
	
	public int getforce(){
		return force;
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
		if (personnage.force < 1){
			System.out.println("Le" + personnage.donnerAuteur() + personnage.getnom + "est déja a terre".)
		}
		else{
			System.out.println(donnerAuteur() + nom + " envoie un grand coup dans la mâchoire au " + donnerAuteur() + personnage.getnom());
		     personnage.recevoirCoup(force);
		}
	}

	protected abstract String donnerAuteur();

}