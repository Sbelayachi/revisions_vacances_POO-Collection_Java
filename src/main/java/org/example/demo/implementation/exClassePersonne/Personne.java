//



package org.example.demo.implementation.exClassePersonne;

public class Personne {

private int code;
private String nom;

// Constructeur               =
    public Personne(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }


    // methodes getter et setter
//    public int getCode() {
////        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public String getCode() {
//        return nom;
//    }
//











    // Une méthode pour retourne l'état de la personne toString() { return ""+""+}


    @Override
    public String toString() {
        return "La Personnes 1 possède l'état suivant : " +
                "code = " + code +
                ", nom = " + nom;

    }}