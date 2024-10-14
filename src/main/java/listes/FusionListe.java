package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        // Création de la liste fusionnée
        List<String> liste3 = new ArrayList<>();

        // Ajout des éléments de liste1
        for (String couleur : liste1) {
            liste3.add(couleur);
        }

        // Ajout des éléments de liste2
        for (String couleur : liste2) {
            liste3.add(couleur);
        }

        // Affichage de la liste fusionnée
        System.out.println("Liste fusionnée : " + liste3);
    }
}
