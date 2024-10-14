package fr.diginamic.banque.entites;

public class Debit extends Operation {

    // Constructeur
    public Debit(String dateOperation, double montant) {
        super(dateOperation, montant);
    }

    // Redéfinition de la méthode getType()
    @Override
    public String getType() {
        return "DEBIT";
    }
}
