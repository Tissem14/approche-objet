package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestTriVillesPopulation {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Filtrer les villes de plus de 25 000 habitants
        ArrayList<Ville> villesFiltres = new ArrayList<>();
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 25000) {
                villesFiltres.add(ville);
            }
        }

        // Tri décroissant par nombre d'habitants
        villesFiltres.sort(Comparator.comparing(Ville::getNbHabitants).reversed());

        // Affichage des villes triées
        for (Ville ville : villesFiltres) {
            System.out.println(ville);
        }
    }
}
