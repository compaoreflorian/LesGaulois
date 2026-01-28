package personnages;

public class Gaulois extends Personnage {
	private double forcePotion = 1;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	protected void boirePotion(double forcePotion) {
		this.forcePotion = forcePotion;
	}
    
	@Override
	protected int calculForceCoup() {
		int forceCoup = (int) (getforce() * forcePotion);
		if (forcePotion > 1) {
			forcePotion = forcePotion - 0.5;
		}
		return forceCoup;
	}

	@Override
	protected String donnerAuteur() {
		return "Gaulois ";
	};
}
