package entites;

import entites2.Personne;
import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        // Utilisation du constructeur avec nom et prénom
        Personne personne1 = new Personne("Dupont", "Jean");
        System.out.println(personne1.nom + " " + personne1.prenom);

        // Utilisation du constructeur avec nom, prénom et adresse
        AdressePostale adresse = new AdressePostale(123, "Rue de l'Exemple", "75000", "Paris");
        Personne personne2 = new Personne("Martin", "Lucie", adresse);

        // Affichage des informations de la personne 2
        System.out.println(personne2.nom + " " + personne2.prenom + ", " +
                personne2.adresse.numeroRue + " " +
                personne2.adresse.libelleRue + ", " +
                personne2.adresse.codePostal + " " +
                personne2.adresse.ville);
    }
}
