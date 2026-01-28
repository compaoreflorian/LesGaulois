package personnages;

import sites.Grade;

public class Soldat extends Romain {
	private Grade grade;
	private Equipement[] equipement = new Equipement[1];

	public Soldat(String nom, int force , Grade grade) {
		super(nom, force);
		this.grade = grade;
	}
	
	public Grade getGrade() {
		return this.grade;
	}

	public void equiper(Equipement equipement){
		if (this.equipement.length ==0){
			this.equipement[0] = equipement;
		}
		else{
			System.out.println("Le "+ donnerAuteur(+ this.getnom()+" est déjà équipé");
		}
	}


	@Override
	protected String donnerAuteur() {
		return this.grade;
	};

	@Override
	public void recevoirCoup(int forceCoup) {
		if (this.equipement.length !=0){
		   switch (equipement[0]) {
		     case CASQUE:
			     forceCoup = forceCoup - 2;
			     break;
		    case PLASTRON:
			     forceCoup = forceCoup - 3;
			     break;
		    default:
			     forceCoup = forceCoup-3;
			     break;
		    }
		}
		
		force = force - forceCoup;
		if (force < 1) {
			force = 0;
			System.out.println("j'abandonne");

		} else {
			System.out.println("Aie");
		}
	}

}
