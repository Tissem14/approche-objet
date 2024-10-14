package entites;

public class AdressePostale {
    private int numeroRue;
    private String libelleRue;
    private String codePostal;
    private String ville;

    // Constructeur
    public AdressePostale(int numeroRue, String libelleRue, String codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // Getters
    public int getNumeroRue() {
        return numeroRue;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }
}
