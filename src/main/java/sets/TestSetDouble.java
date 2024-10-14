package sets;

import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        // Instanciation d'un HashSet de Double
        HashSet<Double> set = new HashSet<>();
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);

        // Affichage de tous les éléments
        System.out.println("Éléments du set : " + set);

        // Recherche du plus grand élément
        double max = Double.MIN_VALUE;
        for (Double d : set) {
            if (d > max) {
                max = d;
            }
        }
        System.out.println("Le plus grand élément : " + max);

        // Recherche et suppression du plus petit élément
        double min = Double.MAX_VALUE;
        for (Double d : set) {
            if (d < min) {
                min = d;
            }
        }
        set.remove(min);
        System.out.println("Set après suppression du plus petit élément : " + set);
    }
}
