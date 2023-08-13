//Exemple d’implémentation d’une classe

 //    ========= DIAPO 11 =========


package org.example.demoGeneralites.implementationClasse;

public class Compte {

    // ATTRIBUTS D'INSTANCE
    private int code;
    protected float solde;

    // constructeur

//    public Compte(float solde, int code) {
//        this.code = code;
//        this.solde = solde;
//    }


// METHODE D'INSTANCE


    public void verser(float montantVerse) {
        solde += montantVerse;
    }

    public void retirer(float montantRetire) {
        solde -= montantRetire;
    }

    // getter/setter

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }


    // AFFICHER ETAT DE L'oBJET = état de la classe Compte implémentée

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}