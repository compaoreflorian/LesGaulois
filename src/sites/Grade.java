package sites;

public enum Grade {
	SOLDAT("soldat"), TESSERASUS("tesserasus"), OPTIO("optio"), CENTURION("centurion");

	private String chaine;

	private Grade(String chaine) {
		this.chaine = chaine;
	}

	@Override
	public String toString() {
		return chaine;
	}
}
