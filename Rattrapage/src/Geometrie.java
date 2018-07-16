import java.util.List;

public class Geometrie {
	
	List<Figure> listeFigure;

    public List<Figure> getListeFig() {
        return listeFigure;
    }

    public void setListeFig(List<Figure> listeFig) {
        this.listeFigure = listeFig;
    }

    public void addFigure(Figure fig) {
        this.listeFigure.add(fig);
    }
    
    public Figure newFigure(double rayon) {
        Disque disque = new Disque();
        disque.setRayon(rayon);
    	this.addFigure(disque);

        return disque;
    }

    public Figure newFigure(double largeur, double longueur) {
        Rectangle rectangle = new Rectangle();
        rectangle.SetRectangle(largeur, longueur);
    	this.addFigure(rectangle);
        return rectangle;
    }
}