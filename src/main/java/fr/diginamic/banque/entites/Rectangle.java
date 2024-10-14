package fr.diginamic.banque.entites;

public class Rectangle implements ObjetGeometrique {
    private double longueur;
    private double largeur;

    // Constructeur
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Implémentation de la méthode perimetre()
    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Implémentation de la méthode surface()
    @Override
    public double surface() {
        return longueur * largeur;
    }
}
