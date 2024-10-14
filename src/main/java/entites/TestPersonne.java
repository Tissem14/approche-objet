package entites;

import entites2.Personne; // Assurez-vous d'importer la classe Personne depuis le bon package
import entites.AdressePostale; // Assurez-vous d'importer la classe AdressePostale depuis le bon package

public class TestPersonne {
    public static void main(String[] args) {
        // Utilisation du constructeur avec nom et prénom
        Personne personne1 = new Personne("Dupont", "Jean");
        personne1.afficherNomPrenom(); // Affiche "DUPONT Jean"

        // Utilisation du constructeur avec nom, prénom et adresse
        AdressePostale adresse = new AdressePostale(123, "Rue de l'Exemple", "75000", "Paris");
        Personne personne2 = new Personne("Martin", "Lucie", adresse);

        // Affichage des informations de la personne 2
        System.out.println(personne2.nom + " " + personne2.prenom + ", " +
                personne2.adresse.numeroRue + " " +
                personne2.adresse.libelleRue + ", " +
                personne2.adresse.codePostal + " " +
                personne2.adresse.ville);

        // Modifier le nom et le prénom
        personne2.setNom("Lemoine");
        personne2.setPrenom("Claire");
        System.out.println("Après modification : " + personne2.getNom() + " " + personne2.getPrenom());

        // Modifier l'adresse
        AdressePostale nouvelleAdresse = new AdressePostale(456, "Avenue de la Paix", "75001", "Paris");
        personne2.setAdresse(nouvelleAdresse);
        System.out.println("Nouvelle adresse : " +
                personne2.getAdresse().numeroRue + " " +
                personne2.getAdresse().libelleRue + ", " +
                personne2.getAdresse().codePostal + " " +
                personne2.getAdresse().ville);
    }
}
