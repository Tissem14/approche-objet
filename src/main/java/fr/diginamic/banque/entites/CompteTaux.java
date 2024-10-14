package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxRemuneration;  // Attribut spécifique

    // Constructeur
    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {
        super(numeroCompte, solde);  // Appel du constructeur de la classe mère
        this.tauxRemuneration = tauxRemuneration;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return super.toString() + ", taux de rémunération=" + tauxRemuneration + "%"; // Utilisation de super
    }
}
