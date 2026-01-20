package Test_fonctionnel;

import Personnages.*;

public class Village {
	private Gaulois chef;

	public Village(Gaulois chef) {
		this.chef = chef;
	}
    
	public Gaulois getchef() {
		return chef;
	}
}
