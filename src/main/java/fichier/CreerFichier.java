package fichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreerFichier {
    public static void main(String[] args) {
        String inputFilePath = "src/main/java/fichier/recensement.csv";  // Chemin d'entrée relatif
        String outputFilePath = "src/main/java/fichier/output_recensement_100.csv";  // Chemin de sortie relatif

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             FileWriter writer = new FileWriter(outputFilePath)) {

            String line;
            int count = 0;

            while ((line = br.readLine()) != null && count < 100) {
                writer.write(line + "\n");
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
