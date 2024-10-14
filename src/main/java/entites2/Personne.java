package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Constructeur avec nom et prénom
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Constructeur avec nom, prénom et adresse
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    // Méthode pour afficher le nom et le prénom (nom en majuscules)
    public void afficherNomPrenom() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    // Méthode pour modifier le nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour modifier le prénom
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode pour modifier l'adresse
    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }

    // Méthode pour retourner le nom
    public String getNom() {
        return nom;
    }

    // Méthode pour retourner le prénom
    public String getPrenom() {
        return prenom;
    }

    // Méthode pour retourner l'adresse
    public AdressePostale getAdresse() {
        return adresse;
    }
}
