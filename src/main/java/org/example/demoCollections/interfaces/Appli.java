package org.example.demoCollections.interfaces;

public class Appli {

    public static void main(String[] args) {

        Cercle cercle1=new Cercle("Cercle toto",10.5);

        cercle1.afficherForme();
        cercle1.afficherCercle();
        System.out.println("Mon aire est la suivante "+ (cercle1.calculerAire() + " cm2"));
        System.out.println("Mon périmètre est le suivant "+ cercle1.calculerPerimetre() + " cm\n");

        Rectangle rectangle1 = new Rectangle("rectangle carré",12.5,12.5);

        rectangle1.afficherRectangle();
        rectangle1.afficherForme();
        System.out.println("Mon aire est la suivante "+ rectangle1.calculerAire()+ " cm2");
        System.out.println("Mon périmètre est le suivant "+ rectangle1.calculerPerimetre() + " cm");


        System.out.println(Forme.compareAire(rectangle1,cercle1));
    }

}
