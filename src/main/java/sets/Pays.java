package sets;

public class Pays {
    private String nom;
    private int nbHabitants;
    private double pibParHabitant;

    public Pays(String nom, int nbHabitants, double pibParHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibParHabitant = pibParHabitant;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public double getPibParHabitant() {
        return pibParHabitant;
    }

    public double getPibTotal() {
        return nbHabitants * pibParHabitant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom + " : " + nbHabitants + " habitants, PIB/habitant : " + pibParHabitant + " €, PIB total : " + getPibTotal() + " €";
    }
}
