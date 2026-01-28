package personnages;

public class Gaulois extends Personnage {
	private int forcePotion =1;
	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	protected void boirePotion(int forcePotion){ 
		this.forcePotion = forcePotion;
		force = force * forcePotion;

	}

	@Override
	public void frapper(Personnage personnage) {
		if (personnage.force < 1){
			System.out.println("Le" + personnage.donnerAuteur() + personnage.getnom + "est déja a terre".)
		}
		else{
			System.out.println(donnerAuteur() + nom + " envoie un grand coup dans la mâchoire au " + donnerAuteur() + personnage.getnom());
		    personnage.recevoirCoup(force / 3);
			if (forcePotion > 1) {
			    forcePotion = forcePotion - 0.5;
		    }
	}

	@Override
	protected String donnerAuteur() {
		return "Gaulois ";
	};
}
