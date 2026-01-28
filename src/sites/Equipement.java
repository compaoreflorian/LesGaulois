public enum Equipement {
    CASQUE("casque"), PLASTRON("plastron"), BOUCLIER("bouclier");
    private String chaine; 
    private Couleur(String chaine) {
         this.chaine = chaine; 
        } 
    @Override 
    public String toString() {
         return chaine; 
        } 

}
