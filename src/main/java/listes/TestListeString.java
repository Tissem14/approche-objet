package listes;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        // Création de la liste de villes
        ArrayList<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        // Rechercher la ville avec le plus grand nombre de lettres
        String villeMax = "";
        for (String ville : villes) {
            if (ville.length() > villeMax.length()) {
                villeMax = ville;
            }
        }
        System.out.println("Ville avec le plus grand nombre de lettres : " + villeMax);

        // Mettre les noms de villes en majuscules
        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }
        System.out.println("Liste des villes en majuscules : " + villes);

        // Supprimer les villes commençant par 'N'
        villes.removeIf(ville -> ville.startsWith("N"));
        System.out.println("Liste après suppression des villes commençant par 'N' : " + villes);
    }
}
