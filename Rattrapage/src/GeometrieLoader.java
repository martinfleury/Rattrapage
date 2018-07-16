import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GeometrieLoader {

	public Geometrie charger(String cheminFichier) throws IOException {
		Geometrie geometrie = new Geometrie();
		try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {
			String ligne;
			while ((ligne = reader.readLine()) != null) {
				String[] colonnes = ligne.split(";");
				
				
		
			}
		}
		
		return geometrie;
	
}
}