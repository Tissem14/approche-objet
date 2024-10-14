package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        // Création de la liste d'entiers
        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);

        // Afficher tous les éléments
        System.out.println("Liste : " + liste);

        // Afficher la taille de la liste
        System.out.println("Taille de la liste : " + liste.size());

        // Trouver et afficher le plus grand élément
        int max = Collections.max(liste);
        System.out.println("Le plus grand élément : " + max);

        // Supprimer le plus petit élément
        int min = Collections.min(liste);
        liste.remove(Integer.valueOf(min));
        System.out.println("Liste après suppression du plus petit élément : " + liste);

        // Convertir les éléments négatifs en positifs
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, Math.abs(liste.get(i)));
            }
        }

        // Afficher la liste finale
        System.out.println("Liste finale : " + liste);
    }
}
