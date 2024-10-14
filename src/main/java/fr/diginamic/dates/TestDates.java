package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        // 1. Date du jour
        Date dateDuJour = new Date();  // Date actuelle
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du jour : " + format1.format(dateDuJour));

        // 2. Date du 19/05/2016 à 23:59:30
        Date dateSpecifique = new Date(116, 4, 19, 23, 59, 30); // Année - 1900, mois - 0-indexé
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date spécifique : " + format2.format(dateSpecifique));

        // 3. Date/heure système
        Date dateHeureSysteme = new Date();
        System.out.println("Date/heure système : " + format2.format(dateHeureSysteme));
    }
}
