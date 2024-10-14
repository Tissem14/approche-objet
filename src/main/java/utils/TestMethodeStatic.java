package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        // Déclaration d'une variable de type chaîne de caractères contenant un nombre entier
        String chaine = "12";

        // Conversion de la chaîne de caractères en entier
        int nombre = Integer.parseInt(chaine);

        // Déclaration de 2 variables de type int
        int a = 10;
        int b = 20;

        // Utilisation de la méthode de la classe Integer pour calculer le maximum entre a et b
        int maximum = Integer.max(a, b);

        // Affichage du résultat
        System.out.println("Le nombre converti est : " + nombre);
        System.out.println("Le maximum entre " + a + " et " + b + " est : " + maximum);
    }
}
