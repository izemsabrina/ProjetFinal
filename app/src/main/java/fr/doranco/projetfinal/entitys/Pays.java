package fr.doranco.projetfinal.entitys;

public class Pays {
    private String nom;
    private String capitale;
    private float pupulation;
    private String drapeau;

    public Pays() {
    }

    public Pays(String nom, String capitale, float pupulation, String drapeau) {
        this.nom = nom;
        this.capitale = capitale;
        this.pupulation = pupulation;
        this.drapeau = drapeau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCapitale() {
        return capitale;
    }

    public void setCapitale(String capitale) {
        this.capitale = capitale;
    }

    public float getPupulation() {
        return pupulation;
    }

    public void setPupulation(float pupulation) {
        this.pupulation = pupulation;
    }

    public String getDrapeau() {
        return drapeau;
    }

    public void setDrapeau(String drapeau) {
        this.drapeau = drapeau;
    }
}
