package listes;

import java.util.Objects;

public class Ville {
    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int population;

    // Constructeur
    public Ville(String nom, String codeDepartement, String nomRegion, int population) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.population = population;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Vérifie si c'est la même instance
        if (obj == null || getClass() != obj.getClass()) return false; // Vérifie si l'objet est de la même classe
        Ville ville = (Ville) obj; // Cast l'objet en Ville
        return population == ville.population &&
                Objects.equals(nom, ville.nom) &&
                Objects.equals(codeDepartement, ville.codeDepartement) &&
                Objects.equals(nomRegion, ville.nomRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, codeDepartement, nomRegion, population);
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", population=" + population +
                '}';
    }
}