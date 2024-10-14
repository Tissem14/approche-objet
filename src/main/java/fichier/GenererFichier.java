package fichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenererFichier {
    public static void main(String[] args) {
        String inputFilePath = "src/main/java/fichier/recensement.csv";  // Chemin du fichier source
        String outputFilePath = "src/main/java/fichier/recensement_villes_plus_25000.csv";  // Fichier de sortie
        ArrayList<Ville> villes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             FileWriter writer = new FileWriter(outputFilePath)) {

            String line;
            line = br.readLine();  // Lire la première ligne pour obtenir les en-têtes
            writer.write(line + "\n");  // Écrire les en-têtes dans le fichier de sortie

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(";");
                String nom = tokens[6].trim();
                String codeDepartement = tokens[2].trim();
                String nomRegion = tokens[1].trim();
                int populationTotale = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));

                Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);

                if (populationTotale > 25000) {
                    villes.add(ville);
                }
            }

            // Écrire les villes de plus de 25 000 habitants dans le fichier
            for (Ville ville : villes) {
                writer.write(ville.getNom() + ";" + ville.getCodeDepartement() + ";" +
                        ville.getNomRegion() + ";" + ville.getPopulationTotale() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
