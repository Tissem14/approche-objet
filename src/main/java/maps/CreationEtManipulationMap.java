package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String[] args) {
        // Création de la map mapVilles
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        // Ajout de nouvelles villes
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        // Affichage des clés
        System.out.println("Clés de la map : ");
        for (Integer key : mapVilles.keySet()) {
            System.out.println(key);
        }

        // Affichage des valeurs
        System.out.println("Valeurs de la map : ");
        for (String value : mapVilles.values()) {
            System.out.println(value);
        }

        // Affichage de la taille de la map
        System.out.println("Taille de la map : " + mapVilles.size());
    }
}
