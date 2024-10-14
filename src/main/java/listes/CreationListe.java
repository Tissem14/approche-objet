package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        // Création de la liste d'entiers
        ArrayList<Integer> liste = new ArrayList<>();

        // Ajouter les nombres de 1 à 100
        for (int i = 1; i <= 100; i++) {
            liste.add(i);
        }

        // Affichage de la taille de la liste
        System.out.println("Taille de la liste : " + liste.size());
    }
}
