package org.example.demoCollections.interfaces;

public class Cercle extends Forme {

private double rayon;

// CONSTRUCTEUR = Attribut de la classe mere FORME = nom
//                Attribut propre à la classe enfant CERCLE
//                ==> rayon (nécessaire pour le calcul de l'aire et du périmètre)
    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }


// Attribut privé (rayon) donc besoin de getter et setter

    public double getRayon() {
        return rayon=Math.PI;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }


/// MEHTODES



    public void afficherCercle() {
        System.out.println("JE SUIS le cercle au caractéristiques suivantes " + "\n => Cercle de nom " + nom+
            "\n => Cercle de rayon " + rayon + " cm" );
    }



    @Override
    public double calculerPerimetre() {
        return Math.round(Math.PI*rayon*rayon);
    }

    @Override
    public double calculerAire() {
        return Math.round(2*Math.PI*rayon);
    }


    public Cercle(String nom) {
        super(nom);
    }

    @Override
    public void afficherForme() {
        super.afficherForme();
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';





    }
}
