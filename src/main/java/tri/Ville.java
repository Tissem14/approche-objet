package tri;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    // Tri par nombre d'habitants
    @Override
    public int compareTo(Ville other) {
        return Integer.compare(this.nbHabitants, other.getNbHabitants());
    }

    @Override
    public String toString() {
        return nom + " : " + nbHabitants + " habitants";
    }
}
