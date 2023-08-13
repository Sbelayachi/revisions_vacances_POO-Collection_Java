package org.example.demoCollections.interfaces;
// implementation de l'interface dans la classe abstraite forme
public abstract class Forme implements Calculable {

    protected String nom;

// Constructeur

    public Forme(String nom) {
        this.nom = nom;
    }


// méthodes

    // affichage état de la forme


    public void afficherForme() {
        System.out.println("JE SUIS la FORME aux caractéristiques suivantes " + "\n => Nom " + nom);
    }
        @Override
    public double calculerPerimetre() {
        return Calculable.super.calculerPerimetre();
    }

    @Override
    public double calculerAire() {
        return 0;
    }

// methode afficher
    @Override
    public String toString() {
        return "Forme{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public static String compareAire(Forme forme1, Forme forme2) {
    double aire1=forme1.calculerAire();
    double aire2=forme2.calculerAire();
    if (aire1>aire2)
    {
        return "l'aire de la forme " +forme1.nom + " (aire = " + aire1 + " ) " +" est supérieure à l'aire de la forme"+ forme2.nom + " (aire = " + aire2 + " )";
    }
    else if (aire1<aire2) {
        return "l'aire de la forme " +forme2.nom + " (aire = " + aire2 + " ) " +" est supérieure à l'aire de la forme"+ forme1.nom + " (aire = " + aire1 + " )";
    }
    else {
        return "Les deux formes : " + forme1.nom + forme2.nom + " ont une aire identique ";
    }










}}