package fr.diginamic.banque.entites;

public class Credit extends Operation {

    // Constructeur
    public Credit(String dateOperation, double montant) {
        super(dateOperation, montant);
    }

    // Redéfinition de la méthode getType()
    @Override
    public String getType() {
        return "CREDIT";
    }
}
