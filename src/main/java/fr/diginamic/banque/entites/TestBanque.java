package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        // Création d'un tableau de comptes
        Compte[] comptes = new Compte[2];

        // Création d'une instance de Compte normal
        comptes[0] = new Compte("123456789", 1000.0);

        // Création d'une instance de CompteTaux
        comptes[1] = new CompteTaux("987654321", 2000.0, 1.5);

        // Boucle pour afficher les informations des comptes
        for (Compte compte : comptes) {
            System.out.println(compte);  // Appelle la méthode toString()
        }
    }
}
