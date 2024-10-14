package listes;

public class TestEquals {
    public static void main(String[] args) {
        // Créer deux instances de Ville avec les mêmes attributs
        Ville ville1 = new Ville("Paris", "75", "Île-de-France", 2148000);
        Ville ville2 = new Ville("Paris", "75", "Île-de-France", 2148000);
        Ville ville3 = new Ville("Lyon", "69", "Auvergne-Rhône-Alpes", 515695);

        // Vérifier que equals retourne true pour les mêmes attributs
        System.out.println("Test equals :");
        System.out.println("ville1.equals(ville2) : " + ville1.equals(ville2)); // Doit être true

        // Vérifier que equals retourne false si un attribut est différent
        ville2.setPopulation(2000000); // Changer la population de ville2
        System.out.println("ville1.equals(ville2) après modification : " + ville1.equals(ville2)); // Doit être false

        // Test avec l'opérateur ==
        System.out.println("\nTest avec l'opérateur == :");
        System.out.println("ville1 == ville2 : " + (ville1 == ville2)); // Doit être false
        System.out.println("ville1 == ville1 : " + (ville1 == ville1)); // Doit être true

        // Pour que == retourne true, il faut référencer la même instance
        Ville ville4 = ville1; // Référence à la même instance
        System.out.println("ville4 == ville1 : " + (ville4 == ville1)); // Doit être true
    }
}
