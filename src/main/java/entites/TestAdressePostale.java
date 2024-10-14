package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(10, "Rue de la Paix", "75002", "Paris");
        AdressePostale adresse2 = new AdressePostale(20, "Avenue des Champs-Élysées", "75008", "Paris");

        System.out.println("Adresse 1: " + adresse1.getNumeroRue() + " " + adresse1.getLibelleRue() + ", " + adresse1.getCodePostal() + " " + adresse1.getVille());
        System.out.println("Adresse 2: " + adresse2.getNumeroRue() + " " + adresse2.getLibelleRue() + ", " + adresse2.getCodePostal() + " " + adresse2.getVille());
    }
}
