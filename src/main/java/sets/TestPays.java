package sets;

import java.util.HashSet;

public class TestPays {
    public static void main(String[] args) {
        // Création du HashSet de pays
        HashSet<Pays> set = new HashSet<>();
        set.add(new Pays("USA", 331000000, 63500));
        set.add(new Pays("France", 67000000, 43200));
        set.add(new Pays("Allemagne", 83000000, 47500));
        set.add(new Pays("UK", 67000000, 42500));
        set.add(new Pays("Italie", 60000000, 35500));
        set.add(new Pays("Japon", 125000000, 41200));
        set.add(new Pays("Chine", 1400000000, 10500));
        set.add(new Pays("Russie", 145000000, 27500));
        set.add(new Pays("Inde", 1380000000, 2100));

        // Recherche du pays avec le PIB/habitant le plus élevé
        Pays paysMaxPibParHabitant = null;
        for (Pays pays : set) {
            if (paysMaxPibParHabitant == null || pays.getPibParHabitant() > paysMaxPibParHabitant.getPibParHabitant()) {
                paysMaxPibParHabitant = pays;
            }
        }
        System.out.println("Pays avec le PIB/habitant le plus élevé : " + paysMaxPibParHabitant);

        // Recherche du pays avec le PIB total le plus élevé
        Pays paysMaxPibTotal = null;
        for (Pays pays : set) {
            if (paysMaxPibTotal == null || pays.getPibTotal() > paysMaxPibTotal.getPibTotal()) {
                paysMaxPibTotal = pays;
            }
        }
        System.out.println("Pays avec le PIB total le plus élevé : " + paysMaxPibTotal);

        // Recherche du pays avec le PIB total le plus faible
        Pays paysMinPibTotal = null;
        for (Pays pays : set) {
            if (paysMinPibTotal == null || pays.getPibTotal() < paysMinPibTotal.getPibTotal()) {
                paysMinPibTotal = pays;
            }
        }

        // Mise en majuscule du pays avec le PIB total le plus faible
        if (paysMinPibTotal != null) {
            paysMinPibTotal.setNom(paysMinPibTotal.getNom().toUpperCase());
        }

        // Suppression du pays avec le PIB total le plus faible
        set.remove(paysMinPibTotal);

        // Affichage des pays restants
        for (Pays pays : set) {
            System.out.println(pays);
        }
    }
}
