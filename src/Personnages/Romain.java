package Personnages;

public class Romain {
    private String nom;
	
	private int force;
	
	public Romain(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getnom() {
		return nom;
	}
	
	public void parler(String text) {
		System.out.println("Le Romain " + this.getnom() + ": << "+text+" >>.");
	}
	
	public void recevoirCoup(int forceCoup) {
	 force= force - forceCoup;
		if (force < 1) {
			force = 0;
			System.out.println("j'abandonne");
		
		}
		else {	System.out.println("Aie");
		}
	}

}
