package fr.diginamic.banque.entites;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        // Déclaration du tableau d'ObjetGeometrique de longueur 2
        ObjetGeometrique[] objets = new ObjetGeometrique[2];

        // Ajout d'une instance de Cercle et de Rectangle dans le tableau
        objets[0] = new Cercle(5.0);  // Cercle avec un rayon de 5
        objets[1] = new Rectangle(4.0, 6.0);  // Rectangle avec une longueur de 4 et une largeur de 6

        // Boucle pour afficher le périmètre et la surface de chaque objet
        for (ObjetGeometrique objet : objets) {
            System.out.println("Périmètre: " + objet.perimetre());
            System.out.println("Surface: " + objet.surface());
        }
    }
}
