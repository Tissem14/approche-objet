package fr.diginamic.banque.entites;

public abstract class Operation {
    protected String dateOperation;
    protected double montant;

    // Constructeur
    public Operation(String dateOperation, double montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    // Méthode abstraite pour le type d'opération
    public abstract String getType();

    // Méthode pour obtenir la date de l'opération
    public String getDateOperation() {
        return dateOperation;
    }

    // Méthode pour obtenir le montant de l'opération
    public double getMontant() {
        return montant;
    }
}

