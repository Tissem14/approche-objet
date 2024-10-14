package maps;

import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        // Création de la map avec des instances de Ville
        HashMap<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

        // Recherche et suppression de la ville la moins peuplée
        String villeMin = null;
        int minHabitants = Integer.MAX_VALUE;

        for (String nom : mapVilles.keySet()) {
            Ville ville = mapVilles.get(nom);
            if (ville.getNbHabitants() < minHabitants) {
                minHabitants = ville.getNbHabitants();
                villeMin = nom;
            }
        }
        if (villeMin != null) {
            mapVilles.remove(villeMin);
        }

        // Affichage des villes restantes
        for (Ville ville : mapVilles.values()) {
            System.out.println(ville);
        }
    }
}

class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public String toString() {
        return nom + " : " + nbHabitants + " habitants";
    }
}
