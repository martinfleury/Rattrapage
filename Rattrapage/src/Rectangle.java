public class Rectangle extends Figure{

	private double largeur;
    private double longueur;

    public Rectangle(double larg, double longueur) {
        this.largeur = larg;
        this.longueur = longueur;
    }
    
    @Override
    public double GetPerimetre() {
    	return (largeur + longueur) * 2;
    }

    @Override
    public double GetAire() {
        return largeur * longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double l) {
        largeur = l;
    }

    public void setLongueur(double l) {
        longueur = l;
    }
    
    @Override
    public String toString() {
        String resultat = "Rectangle de longueur" +this.longueur + "et de largeur" + this.largeur;
        return resultat;
    }
    
}