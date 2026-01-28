package sites;

public enum Equipement {
	CASQUE("casque",2), PLASTRON("plastron",3), BOUCLIER("bouclier",3);

	private String chaine;
    private int forceDeEquipement;
	private Equipement(String chaine,int forceDeEquipement) {
		this.chaine = chaine;
		this.forceDeEquipement = forceDeEquipement;
	}
	
	public int getforce() {
		return forceDeEquipement;
	}

	@Override
	public String toString() {
		return chaine;
	}

}
