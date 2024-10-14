package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(5, "Rue de la Liberté", "75012", "Paris");
        AdressePostale adresse2 = new AdressePostale(15, "Boulevard Saint-Germain", "75006", "Paris");

        Personne personne1 = new Personne("Dupont", "Jean", adresse1);
        Personne personne2 = new Personne("Martin", "Sophie", adresse2);

        System.out.println("Personne 1: " + personne1.getNom() + " " + personne1.getPrenom() + ", Adresse: " + personne1.getAdressePostale().getNumeroRue() + " " + personne1.getAdressePostale().getLibelleRue());
        System.out.println("Personne 2: " + personne2.getNom() + " " + personne2.getPrenom() + ", Adresse: " + personne2.getAdressePostale().getNumeroRue() + " " + personne2.getAdressePostale().getLibelleRue());
    }
}

