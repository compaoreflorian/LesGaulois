package Test_fonctionnel;

import Personnages.*;

public class Camp {
	private Soldat commandant;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}
    
	public Soldat getcommandant() {
		return commandant;
	}
}
