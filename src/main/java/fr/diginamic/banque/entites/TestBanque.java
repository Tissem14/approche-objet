package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        // Créer une instance de la classe Compte
        Compte compte = new Compte("123456789", 1000.0);

        // Afficher l'instance créée
        System.out.println("Numéro de compte : " + compte.getNumeroCompte());
        System.out.println("Solde du compte : " + compte.getSolde());
    }
}
