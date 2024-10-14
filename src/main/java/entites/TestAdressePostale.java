package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        // Utilisation du nouveau constructeur
        AdressePostale adresse1 = new AdressePostale(123, "Rue de l'Exemple", "75000", "Paris");
        AdressePostale adresse2 = new AdressePostale(456, "Avenue du Test", "69000", "Lyon");

        // Affichage des adresses
        System.out.println(adresse1.numeroRue + " " + adresse1.libelleRue + ", " + adresse1.codePostal + " " + adresse1.ville);
        System.out.println(adresse2.numeroRue + " " + adresse2.libelleRue + ", " + adresse2.codePostal + " " + adresse2.ville);
    }
}
