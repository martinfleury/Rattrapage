public class Disque extends Figure {

    double rayon;

    public void setRayon(double r) {

        this.rayon = r;
    }
    
    @Override
    public double GetPerimetre() {
        return 2* Math.PI * this.rayon;
    }

    @Override
    public double GetAire() {
        return Math.PI * this.rayon * this.rayon;
    }

    public double GetRayon() {
        return this.rayon;
    }
    
    @Override
    public String toString() {
        String resultat = "Disque de rayon" + this.rayon;
        return resultat;
    }
    
}