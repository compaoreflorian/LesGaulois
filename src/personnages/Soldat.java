package personnages;

import sites.*;

public class Soldat extends Romain {
	private Grade grade;
	private Equipement[] equipement = new Equipement[1];

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}

	public Grade getGrade() {
		return this.grade;
	}

	public void equiper(Equipement equipement) {
		this.equipement[0] = equipement;
		System.out.println("Le " + donnerGrade() + " " + getnom() + " s'équipe avec un " + equipement.toString());

	}

	protected Grade donnerGrade() {
		return this.grade;
	};

	@Override
	public void recevoirCoup(int forceCoup) {
		forceCoup = forceCoup - this.equipement[0].getforce();
		System.out.println("Le bouclier absorbe " + this.equipement[0].getforce() + " du coup.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
		this.setforce(this.getforce() - forceCoup);
		if (this.getforce() < 1) {
			this.setforce(0);
			;
			System.out.println("j'abandonne");

		} else {
			System.out.println("Aie");
		}
	}

}
