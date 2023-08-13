package org.example.demoCollections.interfaces;

public class Rectangle extends Forme {

    // ATTRIBUT PROPRE à la classe dérivée = Rectangle (pour le calcul de l'aire et du périmètre)
    private double longeur;
    private double largeur;



    // // CONSTRUCTEUR = Attribut de la classe mere FORME = nom
//                       Attribut propre à la classe enfant RECTANGLE
//                       ==> longeur + lageur (nécessaire pour le calcul de l'aire et du périmètre)


    public Rectangle(String nom, double longeur, double largeur) {
        super(nom);
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public void afficherRectangle() {
        System.out.println("JE SUIS le RECTANGLE au caractéristiques suivantes " + "\n => Rectange de nom " + nom+
                "\n => Rectangle de LONGUEUR " + longeur + " cm"+
                "\n => Rectangle de LONGUEUR " + largeur + " cm");
    }

    @Override
    public void afficherForme() {

    }

    @Override
    public double calculerAire() {
        return Math.round(longeur*largeur);
    }

    @Override
    public double calculerPerimetre() {
        return Math.round((largeur+longeur)*2);
    }


    @Override
    public String toString() {
        return "Je suis le Rectangle suivant : " +
                "\n ==> Mon nom est : " + nom+
                "\n ==> J'ai une longeur de " + longeur + " cm"+
                "\n ==> J'ai une largeur de " + largeur + " cm";
    }
}
