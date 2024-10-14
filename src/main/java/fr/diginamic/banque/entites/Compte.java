package fr.diginamic.banque.entites;

public class Compte {
    private String numeroCompte;
    private double solde;

    // Constructeur
    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    // Méthode pour récupérer le numéro de compte
    public String getNumeroCompte() {
        return numeroCompte;
    }

    // Méthode pour récupérer le solde
    public double getSolde() {
        return solde;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Compte [numéro de compte=" + numeroCompte + ", solde=" + solde + "]";
    }
}
