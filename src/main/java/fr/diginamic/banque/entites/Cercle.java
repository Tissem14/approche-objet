package fr.diginamic.banque.entites;

public class Cercle implements ObjetGeometrique {
    private double rayon;

    // Constructeur
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Implémentation de la méthode perimetre()
    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    // Implémentation de la méthode surface()
    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }
}
