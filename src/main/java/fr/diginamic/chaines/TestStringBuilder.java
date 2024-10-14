package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        // Utilisation de StringBuilder
        long debut = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé avec StringBuilder en millisecondes : " + (fin - debut));

        // Utilisation de String avec concaténation
        debut = System.currentTimeMillis();
        String str = "";

        for (int i = 1; i <= 100000; i++) {
            str += i; // Opérateur de concaténation
        }

        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé avec String en millisecondes : " + (fin - debut));
    }
}
