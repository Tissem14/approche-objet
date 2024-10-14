package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        // Création d'un tableau d'opérations
        Operation[] operations = new Operation[4];

        // Ajout d'opérations dans le tableau
        operations[0] = new Credit("12/10/2024", 200.0);
        operations[1] = new Debit("13/10/2024", 50.0);
        operations[2] = new Credit("14/10/2024", 100.0);
        operations[3] = new Debit("15/10/2024", 30.0);

        // Affichage des informations des opérations
        double total = 0;
        for (Operation operation : operations) {
            System.out.println("Date: " + operation.getDateOperation() +
                    ", Montant: " + operation.getMontant() +
                    ", Type: " + operation.getType());

            // Calcul du montant global
            if (operation.getType().equals("CREDIT")) {
                total += operation.getMontant();
            } else if (operation.getType().equals("DEBIT")) {
                total -= operation.getMontant();
            }
        }

        // Affichage du montant global
        System.out.println("Montant global: " + total);
    }
}

