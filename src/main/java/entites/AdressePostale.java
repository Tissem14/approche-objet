package entites;

public class AdressePostale {
    public int numeroRue;
    public String libelleRue;
    public String codePostal;
    public String ville;

    // Constructeur avec 4 paramètres
    public AdressePostale(int numeroRue, String libelleRue, String codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
