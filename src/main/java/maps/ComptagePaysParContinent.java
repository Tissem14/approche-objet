package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        // Création de la liste des pays
        ArrayList<Pays> paysList = new ArrayList<>();
        paysList.add(new Pays("France", 65, "Europe"));
        paysList.add(new Pays("Allemagne", 80, "Europe"));
        paysList.add(new Pays("Belgique", 10, "Europe"));
        paysList.add(new Pays("Russie", 150, "Asie"));
        paysList.add(new Pays("Chine", 1400, "Asie"));
        paysList.add(new Pays("Indonésie", 220, "Océanie"));
        paysList.add(new Pays("Australie", 20, "Océanie"));

        // Comptage des pays par continent
        HashMap<String, Integer> comptage = new HashMap<>();
        for (Pays pays : paysList) {
            comptage.put(pays.getContinent(), comptage.getOrDefault(pays.getContinent(), 0) + 1);
        }

        // Affichage du comptage
        for (String continent : comptage.keySet()) {
            System.out.println("Nombre de pays en " + continent + " : " + comptage.get(continent));
        }
    }
}

class Pays {
    private String nom;
    private int nbHabitants;
    private String continent;

    public Pays(String nom, int nbHabitants, String continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return nom + " : " + nbHabitants + " millions d'habitants, " + continent;
    }
}
