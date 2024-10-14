package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        // 1. Calendar pour la date du 19 mai 2016 à 23h59 et 30 secondes
        Calendar calendarSpecifique = Calendar.getInstance();
        calendarSpecifique.set(2016, Calendar.MAY, 19, 23, 59, 30);
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date spécifique : " + format1.format(calendarSpecifique.getTime()));

        // 2. Calendar pour la date du jour
        Calendar calendarDuJour = Calendar.getInstance();
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date du jour : " + format2.format(calendarDuJour.getTime()));

        // 3. Affichage en différentes langues
        String[] langues = {"fr", "ru", "zh", "de"};
        for (String lang : langues) {
            Locale locale = new Locale(lang);
            SimpleDateFormat formatNomJours = new SimpleDateFormat("EEEE, d MMMM yyyy", locale);
            System.out.println("Date en " + locale.getDisplayLanguage() + " : " + formatNomJours.format(calendarDuJour.getTime()));
        }
    }
}
