package fichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectureFichier {
    public static void main(String[] args) {
        String filePath = "path/to/recensement.csv";  // Remplacez par le chemin correct
        ArrayList<Ville> villes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Ignorer la première ligne qui contient les en-têtes

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(";");
                String nom = tokens[6].trim();
                String codeDepartement = tokens[2].trim();
                String nomRegion = tokens[1].trim();
                int populationTotale = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));

                Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);
                villes.add(ville);
            }

            // Afficher toutes les villes lues
            for (Ville ville : villes) {
                System.out.println(ville);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
