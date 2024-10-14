package sets;

import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        // Instanciation d'un HashSet de String
        HashSet<String> set = new HashSet<>();
        set.add("USA");
        set.add("France");
        set.add("Allemagne");
        set.add("UK");
        set.add("Italie");
        set.add("Japon");
        set.add("Chine");
        set.add("Russie");
        set.add("Inde");

        // Recherche du pays avec le plus grand nombre de lettres
        String paysMax = "";
        for (String pays : set) {
            if (pays.length() > paysMax.length()) {
                paysMax = pays;
            }
        }
        System.out.println("Le pays avec le plus grand nombre de lettres : " + paysMax);

        // Suppression de ce pays
        set.remove(paysMax);
        System.out.println("Set après suppression : " + set);
    }
}
