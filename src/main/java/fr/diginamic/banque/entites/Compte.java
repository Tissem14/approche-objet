package fr.diginamic.banque.entites;

public class Compte {
    // Attributs d'instance
    private String numeroCompte;
    private double solde;

    // Constructeur
    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    // Méthodes d'accès (getters)
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    // Méthodes pour modifier le solde (si nécessaire)
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
        }
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", solde=" + solde +
                '}';
    }
}
