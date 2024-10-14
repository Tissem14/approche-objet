package listes;

import java.util.ArrayList;

public class TestVilles {
    public static void main(String[] args) {
        // Création de la liste de villes
        ArrayList<Ville> villes = new ArrayList<>();
        // Modifier les appels du constructeur pour inclure tous les paramètres requis
        villes.add(new Ville("Nice", "06", "Provence-Alpes-Côte d'Azur", 343000));
        villes.add(new Ville("Carcassonne", "11", "Occitanie", 47800));
        villes.add(new Ville("Narbonne", "11", "Occitanie", 53400));
        villes.add(new Ville("Lyon", "69", "Auvergne-Rhône-Alpes", 484000));
        villes.add(new Ville("Foix", "09", "Occitanie", 9700));
        villes.add(new Ville("Pau", "64", "Nouvelle-Aquitaine", 77200));
        villes.add(new Ville("Marseille", "13", "Provence-Alpes-Côte d'Azur", 850700));
        villes.add(new Ville("Tarbes", "65", "Occitanie", 40600));

        // Rechercher la ville la plus peuplée
        Ville villeMax = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getPopulation() > villeMax.getPopulation()) {
                villeMax = ville;
            }
        }
        System.out.println("Ville la plus peuplée : " + villeMax);

        // Supprimer la ville la moins peuplée
        Ville villeMin = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getPopulation() < villeMin.getPopulation()) {
                villeMin = ville;
            }
        }
        villes.remove(villeMin);
        System.out.println("Liste après suppression de la ville la moins peuplée : " + villes);

        // Mettre en majuscules les villes de plus de 100 000 habitants
        for (Ville ville : villes) {
            if (ville.getPopulation() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        // Afficher la liste finale
        System.out.println("Liste finale : " + villes);
    }
}
